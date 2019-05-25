package com.lojzes.embedTomcat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: lojzes@qq.com
 * @date: 2018-12-17 14:37
 * @description:
 **/
public class HomeServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println(toString()+"  " +Thread.currentThread().getName());

        PrintWriter writer = resp.getWriter();
        writer.write("<html><body>hello embedTomcat</body></html>");
        writer.close();
    }
}
