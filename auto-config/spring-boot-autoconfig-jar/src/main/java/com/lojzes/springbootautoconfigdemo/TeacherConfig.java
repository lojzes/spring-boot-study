package com.lojzes.springbootautoconfigdemo;

import org.springframework.beans.factory.annotation.Value;
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
public class TeacherConfig {

    @Value("${my.teacherName}")
    private String teacherName;

    @Bean
    @ConditionalOnClass(Teacher.class)
    public Teacher teacher(){
        Teacher teacher = new Teacher();
        teacher.setName(teacherName);
        return teacher;
    }

}
