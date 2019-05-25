package com.lojzes.springbootautoconfigdemo;

/**
 * @author liaoyuanyuan
 * @description
 * @see
 * @since 2019-05-25 16:29
 **/
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
