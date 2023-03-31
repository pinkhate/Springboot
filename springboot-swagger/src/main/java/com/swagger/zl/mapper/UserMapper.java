package com.swagger.zl.mapper;

import com.swagger.zl.dao.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ZL
 * @creatTime 2023-03-31
 */
@Mapper
public interface UserMapper {
    List<User> getAllUsers();
}
