package com.example.demo.servlet;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 描述：TODO
 *
 * @author lyyitit@foxmail.com
 * @date 2018/12/16 0016 11:09
 */
@WebFilter(servletNames = {"myServlet"},filterName = "myFilter")
public class MyFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        ServletContext servletContext = getServletContext();

        servletContext.log("myFilter is execute.....");




        filterChain.doFilter(request,response);


    }
}
