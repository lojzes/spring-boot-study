package com.example.demo.springBoot;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 描述：第二种方式，使用springboot 注册
 *
 * @author lyyitit@foxmail.com
 * @date 2018/12/16 0016 10:58
 */

public class MyHttpServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.print("<html><body>hello springBoot2 boot</body></html>");
    }
}