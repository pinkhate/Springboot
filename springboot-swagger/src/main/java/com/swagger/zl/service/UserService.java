package com.swagger.zl.service;

import com.swagger.zl.dao.User;
import com.swagger.zl.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZL
 * @creatTime 2023-03-31
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
