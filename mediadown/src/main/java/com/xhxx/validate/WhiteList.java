package com.xhxx.validate;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: ganduo
 * @description:
 * @date: 14:52 2018/3/17
 */
@Component
public class WhiteList {
    @Value("${white.list.config.path}")
    private String path;

    private Logger logger = LoggerFactory.getLogger(WhiteList.class);

    private List<String> list;
    /**
     * @description: 加载白名单
     * @date: 15:01 2018/3/17
     * @param
     * @return:
     */
    @PostConstruct
    public void load(){
        list = new ArrayList<>();
        BufferedReader bufReader = null;
        try {
            InputStream in = WhiteList.class.getResourceAsStream(path);
            InputStreamReader in2Reader = new InputStreamReader(in);
            bufReader = new BufferedReader(in2Reader);
            String msg = null;
            while (StringUtils.isNotBlank( msg = bufReader.readLine() ) ){
                list.add(msg.trim());
            }
            logger.info("validate white list : " + list.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufReader != null){
                try {
                    bufReader.close();
                    bufReader = null;
                } catch (IOException e) {
                    logger.error("Resource shutdown exception!");
                    e.printStackTrace();
                }
            }
        }
    }

    public boolean isInWhites(String origin){
        return list.contains(origin);
    }
}
