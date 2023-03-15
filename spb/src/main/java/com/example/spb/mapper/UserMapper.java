package com.example.spb.mapper;

import com.example.spb.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    //查询
    public List<User> queryAll();

}
