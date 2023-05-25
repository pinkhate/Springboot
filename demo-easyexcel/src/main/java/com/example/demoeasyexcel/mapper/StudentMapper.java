package com.example.demoeasyexcel.mapper;

import com.example.demoeasyexcel.entity.Student;
import com.sun.tracing.dtrace.ModuleAttributes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ZL
 * @creatTime 2023-05-24
 */
@Mapper
public interface StudentMapper {
    List<Student> getAllStudentList();
}
