package com.xhxx.dbconfig;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


/**
 * @author: ganduo
 * @description:
 * @date: 3:49 2018/3/18
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.getDataSourceType();
    }
}
