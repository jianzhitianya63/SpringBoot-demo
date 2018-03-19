package com.xhxx.mapper;

import com.xhxx.pojo.Articles;
import com.xhxx.pojo.ArticlesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ArticlesMapper {
    long countByExample(ArticlesExample example);

    int deleteByExample(ArticlesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Articles record);

    int insertSelective(Articles record);

    List<Articles> selectByExampleWithBLOBs(ArticlesExample example);

    List<Articles> selectByExample(ArticlesExample example);

    Articles selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Articles record, @Param("example") ArticlesExample example);

    int updateByExampleWithBLOBs(@Param("record") Articles record, @Param("example") ArticlesExample example);

    int updateByExample(@Param("record") Articles record, @Param("example") ArticlesExample example);

    int updateByPrimaryKeySelective(Articles record);

    int updateByPrimaryKeyWithBLOBs(Articles record);

    int updateByPrimaryKey(Articles record);
}