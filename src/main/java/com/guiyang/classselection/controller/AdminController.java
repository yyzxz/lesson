package com.guiyang.classselection.controller;

import com.guiyang.classselection.pojo.dto.User;
import com.guiyang.classselection.pojo.vo.ReplyVO;
import com.guiyang.classselection.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 功能描述
 *
 * @param
 * @author zhangya
 * @date 2019-10-15
 * @return
 */
@Controller
@RequestMapping("/")
public class AdminController {
    @Autowired
    AdminService service;

    // 超级管理员页面
    @GetMapping("/admin")
    public String userManage() {
        // TODO: 2019-10-15  用户管理页面
        return "";
    }

    // 登录页面
    @GetMapping("/login")
    public String login() {
        // TODO: 2019-10-15  登录页面
        return "login";
    }

    //    登录认证
    @PostMapping("/login/verification")
    public String verify() {
        // TODO: 2019-10-15  管理页面
        return "";
    }

    // 添加用户
    @PostMapping("/list/user")
    @ResponseBody
    public ReplyVO list(User user) {
        return service.list(user);
    }

    // 添加用户
    @PostMapping("/list/user/add")
    @ResponseBody
    public ReplyVO addUser(User user) {
        return service.add(user);
    }
//    删除用户
    @PostMapping("/list/user/del")
    @ResponseBody
    public ReplyVO delUser(User user) {
        return service.del(user);
    }

    //    查询用户
    @PostMapping("/list/user/info")
    @ResponseBody
    public ReplyVO userInfo(User user) {
        return service.userInfo(user);
    }

    //    更新用户
    @PostMapping("/list/user/update")
    @ResponseBody
    public ReplyVO updateUser(User user) {
        return service.update(user);
    }
}
