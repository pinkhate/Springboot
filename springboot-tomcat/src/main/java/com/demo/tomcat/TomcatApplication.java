package com.demo.tomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TomcatApplication {

    //tomcat配置
    public static void main(String[] args) {
        SpringApplication.run(TomcatApplication.class, args);
    }

}
