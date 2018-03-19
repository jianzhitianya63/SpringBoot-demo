package com.xhxx.service.impl;

import com.xhxx.article.Process;
import com.xhxx.mapper.ArticleMapper;
import com.xhxx.pojo.Article;
import com.xhxx.pojo.ArticleExample;
import com.xhxx.pojo.Articles;
import com.xhxx.service.ArticleService;
import com.xhxx.utils.ConstantsCode;
import com.xhxx.validate.CheckWordsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gan
 * @desc:
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper artMapper;

    @Autowired
    private CheckWordsService checkService;

    /**
     * @description: 文章处理
     * @date: 13:22 2018/3/17
     * @param article
     * @return:
     */
    @Override
    public Article processContent(Article article) {
        String content = article.getContent();
        if (StringUtils.isBlank(content)){
            article.setStatus(ConstantsCode.FAILED);
            article.setFailedMsg("content is null...");
            return null;
        }

        //敏感字验证
        String result = checkService.sensitiveWords(article);
        if ("2".equals(result)) {
            article.setStatus(ConstantsCode.FAILED);
            article.setFailedMsg("have filter code...");
            return null;
        }
        return article;
    }

    @Override
    public void update(Article art) {
        artMapper.updateByPrimaryKeyWithBLOBs(art);
    }

    /**
     * @desc: 查找未重置数据前200条
     * @param:
     * @return: java.util.List<com.xhxx.pojo.Article>
     */
    @Override
    public List<Article> findFirst200ByStatus(){
        ArticleExample e = new ArticleExample();
        e.setOrderByClause("timestamp ASC");
        e.setStartRow(0);
        e.setPageSize(200);
        ArticleExample.Criteria c = e.createCriteria();
        c.andStatusEqualTo(0);
        //List<Article> list = artMapper.selectByExample();
        List<Article> list = artMapper.selectByExampleWithBLOBs(e);
        return list;
    }
}
