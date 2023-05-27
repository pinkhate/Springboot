package com.example.demoeasyexcel.service;

import com.example.demoeasyexcel.entity.Student;
import com.example.demoeasyexcel.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZL
 * @creatTime 2023-05-24
 */
public interface StudentService {
    //获取学生列表
    List<Student> getAllStudentList() ;
}
