package com.lojzes.springbootautoconfigdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author liaoyuanyuan
 * @description
 * @see
 * @since 2019-05-25 16:15
 **/
@ConfigurationProperties(prefix = "my")
public class StudentProperties {

  private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
