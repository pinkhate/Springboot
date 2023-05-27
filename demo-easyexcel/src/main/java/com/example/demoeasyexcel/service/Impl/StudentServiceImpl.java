package com.example.demoeasyexcel.service.Impl;

import com.example.demoeasyexcel.entity.Student;
import com.example.demoeasyexcel.mapper.StudentMapper;
import com.example.demoeasyexcel.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZL
 * @creatTime 2023-05-27
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    //获取学生列表
    public List<Student> getAllStudentList() {
        return studentMapper.getAllStudentList();
    }
}
