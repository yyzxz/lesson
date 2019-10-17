package com.guiyang.classselection.controller;

import com.guiyang.classselection.pojo.dto.Course;
import com.guiyang.classselection.pojo.dto.Lesson;
import com.guiyang.classselection.pojo.dto.Material;
import com.guiyang.classselection.pojo.vo.ReplyVO;
import com.guiyang.classselection.service.EduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 功能描述
 *
 * @param
 * @author zhangya
 * @date 2019-10-15
 * @return
 */
@Controller
@RequestMapping("/edu")
public class EduController {

    @Autowired
    EduService service;

    //    教务页面
    @GetMapping("")
    public String eduPage() {
        // TODO: 2019-10-15  管理页面
        return "index";
    }

    @PostMapping("/list/course/add")
    @ResponseBody
    public ReplyVO addCourse(Course course) {
        return service.addCourse(course);
    }

    @PostMapping("/list/lesson")
    @ResponseBody
    public ReplyVO listLesson(Course course) {
        return service.listLesson(course);
    }

    @PostMapping("/list/lesson/add")
    @ResponseBody
    public ReplyVO addCoursePlan(Lesson lesson) {
        return service.addCoursePlan(lesson);
    }

    @PostMapping("/lesson/homeworkInfo")
    @ResponseBody
    public ReplyVO homeworkFinInfo(Course course) {
        return service.homeworkFinInfo(course);
    }

    @PostMapping("/lesson/attendanceInfo")
    @ResponseBody
    public ReplyVO attendanceInfo(Course course) {
        return service.attendanceInfo(course);
    }

    @PostMapping("/lesson/attendance/update")
    @ResponseBody
    public ReplyVO updateAttendance(Lesson lesson) {
        return service.updateAttendance(lesson);
    }

    @GetMapping("/list/material")
    @ResponseBody
    public ReplyVO courseMaterial() {
        return service.listCourseMaterial();
    }

    @GetMapping("/list/material")
    @ResponseBody
    public ReplyVO verifyCourseMaterial(Material material) {
        return service.verifyCourseMaterial(material);
    }

    @GetMapping("/list/result")
    @ResponseBody
    public ReplyVO resultFinally() {
        return service.studentResult();
    }



}
