package com.example.jdbc.service;

import com.example.jdbc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述：TODO
 *
 * @author lyyitit@foxmail.com
 * @date 2018/12/23 0023 19:20
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public boolean addUser(User user) {

        return false;
    }

    @Override
    public List<User> list() {

        return (List<User>) jdbcTemplate.query("SELECT id ,user_name as userName  FROM t_user", new ResultSetExtractor() {
            @Override
            public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
                ArrayList<User> users = new ArrayList<>();
                while (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setUserName(rs.getString("userName"));
                    users.add(user);
                }
                return users;
            }
        });

    }
}
