package com.lojzes.springboot2.demo;

import com.lojzes.springbootautoconfigdemo.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author liaoyuanyuan
 * @description
 * @see
 * @since 2019-05-25 17:24
 **/
@SpringBootApplication
public class App {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(App.class, args);

        Student bean = run.getBean(Student.class);

        System.out.println("bean = " + bean.getName());


    }
}
