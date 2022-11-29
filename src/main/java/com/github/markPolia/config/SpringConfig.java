package com.github.markPolia.config;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement
@ComponentScan("com.github.markPolia")
@PropertySource("classpath:jdbc.properties")
@MapperScan({"com.github.markPolia.action.dao", "com.github.markPolia.log.dao"})
public class SpringConfig {
    @Bean
    public DataSource dataSource(@Value("${jdbc.url}") String url,
                                        @Value("${jdbc.driver}") String driver,
                                        @Value("${jdbc.username}") String username,
                                        @Value("${jdbc.password}") String password) {
        PooledDataSource pooledDataSource = new PooledDataSource();
        pooledDataSource.setUrl(url);
        pooledDataSource.setDriver(driver);
        pooledDataSource.setUsername(username);
        pooledDataSource.setPassword(password);
        return pooledDataSource;
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(@Value("classpath:mybatis-config.xml") Resource configLocation,
                                                              @Value("com.github.markPolia.action.domain, " +
                                                                     "com.github.markPolia.log.domain") String aliasesPackage,
                                                              DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setConfigLocation(configLocation);
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage(aliasesPackage);
        return sqlSessionFactoryBean;
    }
}
