package com.lojzes.springbootautoconfigdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liaoyuanyuan
 * @description
 * @see
 * @since 2019-05-25 16:20
 **/
@Configuration
public class SchoolConfig {

    @Value("${my.address}")
    private String schoolAddress;

    @Bean
    @ConditionalOnClass({School.class,Teacher.class})
    public School school(){
        System.out.println("=================school=============================");
        School school = new School();
        school.setAddress(schoolAddress);
        return school;
    }

}
