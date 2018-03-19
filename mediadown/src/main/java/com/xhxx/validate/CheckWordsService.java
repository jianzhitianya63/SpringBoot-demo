package com.xhxx.validate;

import com.xhxx.pojo.Article;
import com.xhxx.pojo.Articles;
import com.xhxx.utils.ConstantsCode;
import com.xhxx.utils.HttpClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: ganduo
 * @description: 敏感字检查
 * @date: 14:49 2018/3/17
 */
@Component
public class CheckWordsService {
    @Autowired
    private WhiteList whiteList;

    @Value("${filter.validate.url}")
    private String url;

    @Value("${filter.validate.timeout}")
    private int timeout;

    @Value("${filter.validate.readout}")
    private int readout;

    public String sensitiveWords(Article art){
        // 白名单验证
        String origin = art.getOrigin();
        if (origin != null && whiteList.isInWhites(origin)) {
            return "0";
        }

        // 敏感字验证
        Map<String, String> params = new HashMap<>();
        params.put("Content", art.getContent());
        String result = HttpClientUtil.doPost(url, params,timeout ,readout);
        return result;
    }
}
