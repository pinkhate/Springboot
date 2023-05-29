package com.example.demoeasyexcel.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.example.demoeasyexcel.entity.Student;
import com.example.demoeasyexcel.listener.StudentListener;
import com.example.demoeasyexcel.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ZL
 * @creatTime 2023-05-24
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public List<Student> getAllStudentList(){
        return studentService.getAllStudentList();
    }

}
