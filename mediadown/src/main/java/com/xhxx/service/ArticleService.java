package com.xhxx.service;

import com.xhxx.mapper.ArticleMapper;
import com.xhxx.pojo.Article;
import com.xhxx.pojo.ArticleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gan
 * @desc: 文章服务类
 */
@Service
public interface ArticleService {
    public List<Article> findFirst200ByStatus();

    public Article processContent(Article article);

    public void update(Article art);
}
