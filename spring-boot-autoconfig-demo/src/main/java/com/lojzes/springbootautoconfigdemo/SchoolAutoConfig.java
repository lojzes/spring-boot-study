package com.lojzes.springbootautoconfigdemo;

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
public class SchoolAutoConfig {

    @Bean
    @ConditionalOnClass({School.class,Teacher.class})
    public School school(){
        System.out.println("=================school=============================");
        return new School();
    }

}
