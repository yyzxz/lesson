package com.guiyang.classselection.controller;

import com.guiyang.classselection.pojo.vo.ReplyVO;
import com.guiyang.classselection.service.TeacherService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * 功能描述
 *
 * @param
 * @author zhangya
 * @date 2019-10-15
 * @return
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherService service;

    //  页面
    @GetMapping("/")
    public String index() {
        return "";
    }

    @PostMapping("/upload")
    @ResponseBody
    public ReplyVO upload(@RequestParam("type") int type, @RequestParam("file1") MultipartFile file) {
        if (file.isEmpty()) {
            System.out.println("empty file");
        }
        return service.upload(file, type);
    }



}
