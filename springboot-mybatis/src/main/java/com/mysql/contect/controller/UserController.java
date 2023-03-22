package com.mysql.contect.controller;

import com.alibaba.excel.EasyExcel;
import com.mysql.contect.model.User;
import com.mysql.contect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author ZL
 * @creatTime 2023-03-22
 */

@RestController
public class UserController {

    @Autowired
    UserService  userService;

    @GetMapping("/export")
    public void exportExcel(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        List<User> list =  userService.getAllUsers();

        resp.setHeader("content-disposition",
                "attachment;filename="+new String("用户数据.xlsx".getBytes("UTF-8"),"ISO8859-1"));
    EasyExcel.write(resp.getOutputStream(), User.class).sheet("用户数据").doWrite(list);


    }

}
