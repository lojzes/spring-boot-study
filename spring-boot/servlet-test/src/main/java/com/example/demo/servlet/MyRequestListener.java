package com.example.demo.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * 描述：TODO
 *
 * @author lyyitit@foxmail.com
 * @date 2018/12/16 0016 11:14
 */

@WebListener
public class MyRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        //获取事件源
        ServletRequest servletRequest = sre.getServletRequest();
        ServletContext servletContext = servletRequest.getServletContext();
        servletContext.log(  servletRequest.getServerName()+" is initialized");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        //获取事件源
        ServletRequest servletRequest = sre.getServletRequest();
        ServletContext servletContext = servletRequest.getServletContext();
        servletContext.log(  servletRequest.getServerName()+" is initialized");
    }
}
