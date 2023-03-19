package com.zl.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author ZL
 * @creatTime 2023-03-19
 */
@Component
@PropertySource("classpath:book.properties")
//属性安全的注入
@ConfigurationProperties(prefix = "book")
public class Book {

//    @Value("${book.name}")
    private String name;

//    @Value("${book.sno}")
    private String sno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", sno='" + sno + '\'' +
                '}';
    }
}
