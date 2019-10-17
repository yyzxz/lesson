package com.guiyang.classselection.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能描述
 *
 * @param
 * @author zhangya
 * @date 2019-10-15
 * @return
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    //    学生页面
    @GetMapping("/")
    public String page() {
        // TODO: 2019-10-15  页面
        return "";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
