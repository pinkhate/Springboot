package com.mysql.contect.service;

import com.mysql.contect.Mapper.UserMapper;
import com.mysql.contect.model.User;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZL
 * @creatTime 2023-03-22
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public void addUsers(List<User> list) {
        //获取一个批处理的sqlSession
        SqlSession sqlSession = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH);

        UserMapper jm = sqlSession.getMapper(UserMapper.class);
        for (User user:list){
            //这个时候，经过jm批量操作，并不会平凡的打开/关闭sqlSession,还需要在数据库链接文件中加入&rewriteBatchedStatements=true
            jm.addUser(user);
        }

    }
}
