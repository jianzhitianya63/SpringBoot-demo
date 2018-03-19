package com.xhxx.service;

import com.xhxx.pojo.Proxyipandport;

/**
 * @author gan
 * @desc: 代理IP服务类
 */
public interface ProxyIpService {
    Proxyipandport randomProxyIP(Integer delay);
    void setProxyIP(Proxyipandport proxyIP);
}
