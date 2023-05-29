package com.example.demoeasyexcel.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentFontStyle;
import com.alibaba.excel.enums.BooleanEnum;
import lombok.Data;
import lombok.Value;

/**
 * @author ZL
 * @creatTime 2023-05-24
 * 格式下有两个注解
 * DateTimeFormat
 * NumberFormat
 * 书写样式下的注解
 * ColumnWidth
 * ContentFontStyle
 * ContentLoopMerge
 * ContentRowHeight
 * ContentStyle
 * HeadFontStyle
 * HeadRowHeight
 * HeadStyle
 * OnceAbsoluteMerge
 * 以及剩下的三个Excel开头的注解
 * ExcelIgnore
 * ExcelIgnoreUnannotated
 * ExcelProperty
 */
@Data
public class Student {

    @ExcelIgnore //默认忽略字段
    @ExcelProperty(value = "学号")
    private String sno;
    @ExcelProperty(value = "姓名")
    private String name;
    @ExcelProperty(value = "年龄")
    private Integer age;
    @ColumnWidth(20)
    @ContentFontStyle(fontName = "微软雅黑",color = 10,typeOffset = 1,underline = 1,italic = BooleanEnum.TRUE)
    @ExcelProperty(value = "职业")
    private String major;

}
