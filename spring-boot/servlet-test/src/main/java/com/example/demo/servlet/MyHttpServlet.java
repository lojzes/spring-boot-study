package com.example.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 描述：第一种方式，使用原生servlet 注册
 *
 * @author lyyitit@foxmail.com
 * @date 2018/12/16 0016 10:58
 */

@WebServlet(name = "myServlet",urlPatterns = "/hello/servlet")
public class MyHttpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        String servletPath = req.getServletPath();
        System.out.println("servletPath = " + servletPath);
        String pathInfo = req.getPathInfo();
        System.out.println("pathInfo = " + pathInfo);

        String requestURI = req.getRequestURI();
        System.out.println("requestURI = " + requestURI);
        String getRequestURL = req.getRequestURL().toString();
        System.out.println("getRequestURL = " + getRequestURL);

        //jsr： requestURI = contextPath + servletPath + pathInfo;

        writer.print("<html><body>hello springBoot boot</body></html>");
    }
}
