package com.example.demoeasyexcel.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.example.demoeasyexcel.entity.Student;

/**
 * @author ZL
 * @creatTime 2023-05-27
 */
public class StudentListener extends AnalysisEventListener<Student> {
    /**
     *
     * @param data  读excel表中的每行数据一行代表一个data
     * @param context
     */
    @Override
    public void invoke(Student data, AnalysisContext context) {
        System.out.println("data = " + data);
        //将数据写入到数据库

    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

    }
}
