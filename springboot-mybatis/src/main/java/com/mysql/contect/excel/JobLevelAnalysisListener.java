package com.mysql.contect.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.mysql.contect.model.User;
import com.mysql.contect.service.UserService;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZL
 * @creatTime 2023-03-24
 *
 * 这是excel解析监听器
 */
public class JobLevelAnalysisListener extends AnalysisEventListener{
    private List<User> list = new ArrayList<>();
    private UserService userService;

    public JobLevelAnalysisListener(UserService userService) {
        this.userService = userService;
    }

    /**
     * 每一行数据读取完毕后，会触发该方法
     * @param o
     * @param analysisContext
     */
    @Override
    public void invoke(Object o, AnalysisContext analysisContext) {
            list.add((User) o);
    }

    /**
     * 整个excel文件解析完毕会触发该方法
     * @param analysisContext
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {


        //集合批量插入
        //要开启jdbc的批处理
//        for(User user:list){
////              执行数据插入
////            userService.addUser(user);
//
//        }
        //通过上面执行插入耗时太长可以通过改变jdbc批处理功能实现快速插入
        userService.addUsers(list);


        //insert into xxx(x,x)values(1,2),(1,3)

    }
}
