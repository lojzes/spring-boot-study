package com.lojzes.springboot2;

import com.lojzes.springbootautoconfigdemo.School;
import com.lojzes.springbootautoconfigdemo.Student;
import com.lojzes.springbootautoconfigdemo.Teacher;
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
        //SpringApplication.run(App.class, args);

        Student student = run.getBean(Student.class);

        System.out.println("student = " + student.getName());


        School school = run.getBean(School.class);

        System.out.println("school = " + school.getAddress());


        Teacher teacher = run.getBean(Teacher.class);

        System.out.println("teacher = " + teacher.getName());
    }
}
