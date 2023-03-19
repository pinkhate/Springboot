package com.demo.tomcat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZL
 * @creatTime 2023-03-19
 */
@RestController
public class ErrorPath {

    @GetMapping("/hello")
    public String getErrorPage(){
        System.out.println("hello");
//        return "/error.html";
        return "ssss";
    }
}
