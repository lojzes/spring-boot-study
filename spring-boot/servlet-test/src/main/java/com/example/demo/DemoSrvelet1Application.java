package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.example.demo.servlet")
public class DemoSrvelet1Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoSrvelet1Application.class, args);
    }
}
