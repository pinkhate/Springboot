package com.example.demoeasyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.example.demoeasyexcel.entity.Student;
import com.example.demoeasyexcel.listener.StudentListener;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class DemoEasyexcelApplicationTests {

    @Test
    void contextLoads() {
    }



    @Test
    public void testo1(){

        /**
         * Build excel the read
         *
         * @param pathName     File path to read. 文件路径
         * @param head         Annotate the class for configuration information. 每行数据对应的实体；Student.class
         * @param readListener Read listener. 读监听器，每读一样就会调用一次该监听器的invoke方法
         * @return Excel reader builder.
         */
        //这一步就相当于打开一个工作簿
        ExcelReaderBuilder read = EasyExcel.read("student.xlsx", Student.class, new StudentListener());
        //接下来打开工作表对象，默认读取第一个工作表对象,当然可以根据工作表的名字进行读取,也可以根据工作表的序号进行读取，默认第一个工作表的序号为0，剩下的一次类推
//        ExcelReaderSheetBuilder sheet = read.sheet(2);
        ExcelReaderSheetBuilder sheet = read.sheet("test");
        //读取工作表中的内容
        sheet.doRead();


    }

    @Test
    public void test02(){



    }

}
