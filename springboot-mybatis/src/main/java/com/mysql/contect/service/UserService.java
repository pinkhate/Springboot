package com.mysql.contect.service;

import com.mysql.contect.Mapper.UserMapper;
import com.mysql.contect.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZL
 * @creatTime 2023-03-22
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
