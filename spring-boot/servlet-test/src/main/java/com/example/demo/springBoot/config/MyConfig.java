package com.example.demo.springBoot.config;

import com.example.demo.springBoot.MyFilter2;
import com.example.demo.springBoot.MyHttpServlet2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：springboot方式注册servlet\filter
 *
 * @author lyyitit@foxmail.com
 * @date 2018/12/16 0016 11:09
 */
@Configuration
public class MyConfig {
    @Bean
    public static ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new MyHttpServlet2());
        servletRegistrationBean.setName("MyHttpServlet2");
        servletRegistrationBean.addUrlMappings("/hello/servlet2");
        return  servletRegistrationBean;
    }

    @Bean
    public static FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter2());
        filterRegistrationBean.addServletNames("MyHttpServlet2");
        return filterRegistrationBean;
    }
}
