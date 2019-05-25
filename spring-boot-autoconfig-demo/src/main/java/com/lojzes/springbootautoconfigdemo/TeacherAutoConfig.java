package com.lojzes.springbootautoconfigdemo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liaoyuanyuan
 * @description
 * @see
 * @since 2019-05-25 16:26
 **/
@Configuration
public class TeacherAutoConfig {

    @Bean
    @ConditionalOnClass(Teacher.class)
    public Teacher teacher(){
        System.out.println("=================teacher=============================");
        return new Teacher();
    }

}
