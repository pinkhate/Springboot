package com.example.demoeasyexcel.service;

import com.example.demoeasyexcel.dao.StudentDao;
import com.example.demoeasyexcel.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZL
 * @creatTime 2023-05-24
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public List<Student> getAllStudentList() {
       return studentDao.getAllStudentList();
    }
}
