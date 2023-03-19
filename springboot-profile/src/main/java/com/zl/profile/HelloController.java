package com.zl.profile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZL
 * @creatTime 2023-03-19
 *
 * 开发环境
 * 端口： 8080
 * contextpath: /dev
 *
 * 生产环境
 * 端口：80
 * contextpath :/
 *
 *
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello(){
        return "hello profile";
    }
}
