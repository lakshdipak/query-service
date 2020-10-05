package com.demo.query;

import com.demo.query.generator.QueryGeneratorFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Autowired
    private BeanFactory beanFactory;

    public ServiceLocatorFactoryBean serviceLocatorFactoryBean() {
        final ServiceLocatorFactoryBean locatorFactoryBean = new ServiceLocatorFactoryBean();
        locatorFactoryBean.setBeanFactory(beanFactory);
        locatorFactoryBean.setServiceLocatorInterface(QueryGeneratorFactory.class);
        return locatorFactoryBean;
    }

    @Bean
    public QueryGeneratorFactory queryGeneratorFactory() {
        final ServiceLocatorFactoryBean locatorFactoryBean = serviceLocatorFactoryBean();
        locatorFactoryBean.afterPropertiesSet();
        return (QueryGeneratorFactory)locatorFactoryBean.getObject();
    }}