package com.zl.yml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YmlApplicationTests {

    @Autowired
    User user;

    @Test
    void contextLoads() {
        System.out.println("user = " + user);

    }

}
