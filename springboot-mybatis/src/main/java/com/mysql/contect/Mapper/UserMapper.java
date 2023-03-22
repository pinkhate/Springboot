package com.mysql.contect.Mapper;

import com.mysql.contect.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ZL
 * @creatTime 2023-03-22
 */

@Component
public interface UserMapper {
    List<User> getAllUsers();
}
