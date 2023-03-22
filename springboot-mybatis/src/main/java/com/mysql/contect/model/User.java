package com.mysql.contect.model;

import com.alibaba.excel.annotation.ExcelProperty;
import org.springframework.stereotype.Component;

import javax.naming.Name;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author ZL
 * @creatTime 2023-03-22
 */
@Component
//@EqualsAndHashCode
public class User implements Serializable {

    @ExcelProperty("用户名")
    private String name;
    @ExcelProperty("密码")
    private String pwd;
    @ExcelProperty("角色")
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(pwd, user.pwd) &&
                Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pwd, role);
    }
}
