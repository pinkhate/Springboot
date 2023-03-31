package com.swagger.zl.controller;

import com.swagger.zl.dao.User;
import com.swagger.zl.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ZL
 * @creatTime 2023-03-31
 */

@RestController
@Api("用户管理")
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation("获取用户信息")
    @GetMapping("/user")
    public List<User> getAllUsers(){
         return userService.getAllUsers();
    }
}
