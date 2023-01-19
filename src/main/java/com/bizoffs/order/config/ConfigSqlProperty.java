package com.bizoffs.order.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("file:order_view_sql.properties")
public class ConfigSqlProperty {

    @Autowired
    private Environment env;

    public String getSql(String sqlName) {
        return  env.getProperty(sqlName);
    }
}
