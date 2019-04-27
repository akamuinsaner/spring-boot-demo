package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Autowired
    private ConfigProperties configProperties;
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(configProperties.getDriverClassName());
        ds.setUrl(configProperties.getDataSourceUrl());
        ds.setUsername(configProperties.getDataSourceUsername());
        ds.setPassword(configProperties.getDataSourcePassword());
        return ds;
    }
}