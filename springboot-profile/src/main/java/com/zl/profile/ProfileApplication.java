package com.zl.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ProfileApplication {

    public static void main(String[] args) {

//        SpringApplication.run(ProfileApplication.class, args);

        SpringApplicationBuilder builder = new SpringApplicationBuilder(ProfileApplication.class);
        //设置环境
        builder.application().setAdditionalProfiles("prod");
        builder.run(args);
    }



}
