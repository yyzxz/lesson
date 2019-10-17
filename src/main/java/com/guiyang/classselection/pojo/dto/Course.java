package com.guiyang.classselection.pojo.dto;

/**
 * ClassName: com.guiyang.classselection.pojo
 *
 * @author zhangya
 * @Description: ${todo}
 * @date 2019-10-15
 */
public class Course {
    int id;
    String code;
    String name;
    String desc;
    int teacher_id;
    float credit;
    int on_flg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public int getOn_flg() {
        return on_flg;
    }

    public void setOn_flg(int on_flg) {
        this.on_flg = on_flg;
    }
}
