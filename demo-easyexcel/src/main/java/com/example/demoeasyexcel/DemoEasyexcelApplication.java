package com.example.demoeasyexcel;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demoeasyexcel.mapper")
public class DemoEasyexcelApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEasyexcelApplication.class, args);
    }

}
