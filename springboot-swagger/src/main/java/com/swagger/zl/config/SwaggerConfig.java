package com.swagger.zl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author ZL
 * @creatTime 2023-03-31
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }
    //配置
    private ApiInfo apiInfo(){

        return new ApiInfo("Api Documentation",
                "学生管理系统",
                "1.0",
                "urn:tos",
                new Contact("1", "1", "1"),
                "Apache 2.0",
                "www.baidu.com", new ArrayList());
    }
}
