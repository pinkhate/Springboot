package com.zl.value;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OriginValueApplicationTests {

    @Autowired
    Book book;

    @Test
    void contextLoads() {
        System.out.println(book);
    }

}
