package com.kind.design.pattern.structural.proxy.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author zhoujifeng
 * @date 2020/5/10 11:15 上午
 */
public class DynamicDataSource extends AbstractRoutingDataSource {


    protected Object determineCurrentLookupKey() {

        return DataSourceContextHolder.getDBType();

    }
}
