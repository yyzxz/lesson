package com.guiyang.classselection.pojo.dto;

/**
 * ClassName: com.guiyang.classselection.pojo.dto
 *
 * @author zhangya
 * @Description: ${todo}
 * @date 2019-10-16
 */
public class Lesson {
    int id;
    int course_id;
    String name;
    String code;
    long lesson_order;
    String desc;
    String homework_desc;
    int attendance;
    int flg = 0;

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public String getHomework_desc() {
        return homework_desc;
    }

    public void setHomework_desc(String homework_desc) {
        this.homework_desc = homework_desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getLesson_order() {
        return lesson_order;
    }

    public void setLesson_order(long lesson_order) {
        this.lesson_order = lesson_order;
    }

    public int getFlg() {
        return flg;
    }

    public void setFlg(int flg) {
        this.flg = flg;
    }
}
