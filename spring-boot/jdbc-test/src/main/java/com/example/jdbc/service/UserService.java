package com.example.jdbc.service;

import com.example.jdbc.model.User;

import java.util.List;

/**
 * 描述：TODO
 *
 * @author lyyitit@foxmail.com
 * @date 2018/12/23 0023 19:19
 */
public interface UserService {
    boolean addUser(User user);

    List<User> list();

}
