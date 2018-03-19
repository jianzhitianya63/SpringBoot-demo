package com.xhxx.mapper;

import java.util.List;

import com.xhxx.pojo.Proxyipandport;
import com.xhxx.pojo.ProxyipandportExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProxyipandportMapper {
    long countByExample(ProxyipandportExample example);

    int deleteByExample(ProxyipandportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Proxyipandport record);

    int insertSelective(Proxyipandport record);

    List<Proxyipandport> selectByExample(ProxyipandportExample example);

    Proxyipandport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Proxyipandport record, @Param("example") ProxyipandportExample example);

    int updateByExample(@Param("record") Proxyipandport record, @Param("example") ProxyipandportExample example);

    int updateByPrimaryKeySelective(Proxyipandport record);

    int updateByPrimaryKey(Proxyipandport record);

    Proxyipandport randomProxyIP(Integer delay);
}