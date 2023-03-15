package com.example.spb.controller;

import com.example.spb.dao.User;
import com.example.spb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public List<User> queryAll(){

        List<User> users = userService.queryAll();
        System.out.println("users = " + users);
        return users;

    }
}
