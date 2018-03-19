package com.xhxx.article;

import com.xhxx.pojo.Articles;
import com.xhxx.utils.ConstantsCode;
import com.xhxx.utils.FastMediaUtil;
import com.xhxx.utils.RegexHelper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;

/**
 * @author: ganduo
 * @description: 文章处理
 * @date: 14:03 2018/3/17
 */
@Component
public class Process {
    @Autowired
    private FastMediaUtil fastUtil;

    @Value("${media.server.url}")
    private String mediaUrl;

    private final Logger logger = LoggerFactory.getLogger(Process.class);
    /**
     * @description: 替换第三方图片链接为内部链接
     * @date: 18:00 2018/3/17
     * @param arts
     * @return:
     */
    public Articles imgUrlReplace(Articles arts) {
        try {
            String content = arts.getContent();
            List<String> imageSrcs = RegexHelper.getImageSrc(content);
            //上传至FastDFS
            String localPath = null;
            for (String imgSrc:imageSrcs) {
                localPath = fastUtil.uploadFileFastDFS(imgSrc);
                if (StringUtils.isNotBlank(localPath)) {
                    localPath = mediaUrl + localPath;
                }
                content = content.replaceAll(Matcher.quoteReplacement(imgSrc), localPath);
            }
            arts.setContent(content);

            //替换展示图片链接
            String imgUrlOne = arts.getImage1();
            String imgUrlTwo = arts.getImage2();
            String imgUrlThree = arts.getImage3();
            String localUrlOne = null;
            String localUrlTwo = null;
            String localUrlThree = null;
            if (StringUtils.isNotBlank(imgUrlOne)) {
                imgUrlOne = fastUtil.uploadFileFastDFS(imgUrlOne);
                localUrlOne = mediaUrl + localUrlOne;
                arts.setImage1(localUrlOne);
            }
            if (StringUtils.isNotBlank(imgUrlTwo)) {
                imgUrlTwo = fastUtil.uploadFileFastDFS(imgUrlTwo);
                localUrlTwo = mediaUrl + imgUrlTwo;
                arts.setImage2(localUrlTwo);
            }
            if (StringUtils.isNotBlank(imgUrlThree)) {
                imgUrlThree = fastUtil.uploadFileFastDFS(imgUrlThree);
                localUrlThree = mediaUrl + imgUrlThree;
                arts.setImage3(localUrlThree);
            }
            return arts;
        } catch (IOException e) {
            logger.error("FastDFS handling image failure! ");
            e.printStackTrace();
            return null;
        }
    }
}
