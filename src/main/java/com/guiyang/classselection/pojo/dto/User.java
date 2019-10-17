package com.guiyang.classselection.pojo.dto;

/**
 * ClassName: com.guiyang.classselection.pojo.dto
 *
 * @author zhangya
 * @Description: ${todo}
 * @date 2019-10-16
 */
public class User {
    int id;
    String username;
    String pass;
    String name;
    int gender;
    int role;
    String session;
    String grade_class;
    int on_flg;

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getGrade_class() {
        return grade_class;
    }

    public void setGrade_class(String grade_class) {
        this.grade_class = grade_class;
    }

    public int getOn_flg() {
        return on_flg;
    }

    public void setOn_flg(int on_flg) {
        this.on_flg = on_flg;
    }
}
