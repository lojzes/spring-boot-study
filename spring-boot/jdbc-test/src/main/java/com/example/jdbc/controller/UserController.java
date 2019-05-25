package com.example.jdbc.controller;

import com.example.jdbc.model.User;
import com.example.jdbc.service.UserService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述：TODO
 *
 * @author lyyitit@foxmail.com
 * @date 2018/12/23 0023 19:24
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user/list")
    public List<User> getUserList(){
        return userService.list();
    }

}
