package com.lojzes.springbootautoconfigdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liaoyuanyuan
 * @description
 * @see
 * @since 2019-05-25 16:15
 **/
@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(StudentProperties.class)
public class StudentAutoConfig {

    @Autowired
    private StudentProperties studentProperties;

    @Bean
    @ConditionalOnMissingBean
    public Student student(){
        System.out.println("=================student=============================");
        return new Student(studentProperties.getName());
    }
}
