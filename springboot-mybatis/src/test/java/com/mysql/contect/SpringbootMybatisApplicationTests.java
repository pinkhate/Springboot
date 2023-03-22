package com.mysql.contect;

import com.mysql.contect.Mapper.UserMapper;
import com.mysql.contect.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {

        List<User> list = userMapper.getAllUsers();
        for (User user:list){
            System.out.println("user = " + user);
        }
    }

}
