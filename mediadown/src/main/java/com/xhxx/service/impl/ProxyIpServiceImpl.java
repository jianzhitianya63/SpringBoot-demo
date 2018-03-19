package com.xhxx.service.impl;

import com.xhxx.mapper.ProxyipandportMapper;
import com.xhxx.pojo.Proxyipandport;
import com.xhxx.service.ProxyIpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author gan
 * @desc:
 */
@Service
public class ProxyIpServiceImpl implements ProxyIpService {
    @Autowired
    private ProxyipandportMapper IPMapper;

    private final Logger logger = LoggerFactory.getLogger(ProxyIpService.class);
    /**
     * @desc: 随机获取代理IP
     * @param: 延迟
     * @return: com.xhxx.pojo.Proxyipandport
     */
    @Override
    public Proxyipandport randomProxyIP(Integer delay) {
        if (delay == null || delay <= 0){
            logger.info("delay param error!");
            return null;
        }
        Proxyipandport proxyIP = IPMapper.randomProxyIP(delay);
        return proxyIP;
    }

    @Override
    public void setProxyIP(Proxyipandport proxyIP) {
        System.getProperty("http.maxRedirects", "50");
        System.getProperties().setProperty("proxySet", "true");
        System.getProperties().setProperty("http.proxyHost", proxyIP.getIp());
        System.getProperties().setProperty("http.proxyPort", proxyIP.getPort() + "");
    }
}
