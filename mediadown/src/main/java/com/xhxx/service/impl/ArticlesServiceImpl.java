package com.xhxx.service.impl;

import com.xhxx.dbconfig.TargetDataSource;
import com.xhxx.mapper.ArticlesMapper;
import com.xhxx.pojo.Articles;
import com.xhxx.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


/**
 * @author: ganduo
 * @description:
 * @date: 12:47 2018/3/18
 */
@Service
public class ArticlesServiceImpl implements ArticlesService{
    @Autowired
    private ArticlesMapper artsMapper;

    @TargetDataSource(name="ds1")
    @Override
    public int insert(Articles arts){
        arts.setAddtime(new Date());
        return artsMapper.insert(arts);
    }
}
