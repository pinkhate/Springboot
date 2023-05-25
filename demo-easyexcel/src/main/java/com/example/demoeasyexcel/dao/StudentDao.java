package com.example.demoeasyexcel.dao;

import com.example.demoeasyexcel.entity.Student;
import com.example.demoeasyexcel.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZL
 * @creatTime 2023-05-24
 */
@Repository
public class StudentDao {
    @Autowired
    private StudentMapper studentMapper;


    public List<Student> getAllStudentList() {
        List<Student> studentList = studentMapper.getAllStudentList();
        return studentList;
    }
}
