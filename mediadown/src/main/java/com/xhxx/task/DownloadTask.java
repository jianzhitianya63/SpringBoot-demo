package com.xhxx.task;

import com.xhxx.article.Process;
import com.xhxx.pojo.Article;
import com.xhxx.pojo.Articles;
import com.xhxx.pojo.Proxyipandport;
import com.xhxx.service.ArticleService;
import com.xhxx.service.ArticlesService;
import com.xhxx.service.ProxyIpService;
import com.xhxx.utils.ConstantsCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author gan
 * @desc: 定时从数据源中获取未重置数据进行重置
 */
@Component
public class DownloadTask {
    @Autowired
    private ArticleService artService;

    @Autowired
    private ProxyIpService IPService;

    @Value("${proxy.ip.delay}")
    private Integer delay;

    @Autowired
    private Process process;

    private final Logger logger = LoggerFactory.getLogger(DownloadTask.class);

    @Autowired
    private ArticlesService artsService;

    @Scheduled(fixedDelay = 10 * 1000)
    public void task() {
        long beginTime = System.currentTimeMillis();
        logger.info("begin to download from third platform ------");
        execute();
        logger.info("download from third platform finished ------" + (System.currentTimeMillis() - beginTime));
    }

    public void execute() {
        List<Article> list = artService.findFirst200ByStatus();
        if (list.isEmpty()) {
            return;
        }

        for (Article art : list) {
            // 设置代理IP
            Proxyipandport proxyIP = IPService.randomProxyIP(delay);
            IPService.setProxyIP(proxyIP);

            //  敏感字验证
            art = artService.processContent(art);
            if (art == null) {
                artService.update(art);
                continue;
            }

            //  替换图片
            Articles arts = new Articles(art);
            arts = process.imgUrlReplace(arts);
            if (arts == null) {
                art.setStatus(ConstantsCode.FAILED);
                art.setFailedMsg("handling image failure! ");
                artService.update(art);
                continue;
            }

            //入库
            int result = artsService.insert(arts);
            if (result < 1) {
                art.setStatus(ConstantsCode.FAILED);
                art.setFailedMsg("articlesDB insert data failure! ");
            } else {
                art.setStatus(ConstantsCode.SUCCESS);
            }
            artService.update(art);
        }

    }
}
