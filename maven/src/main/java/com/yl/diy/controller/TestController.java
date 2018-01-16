package com.yl.diy.controller;

import com.yl.diy.domain.User;
import com.yl.diy.service.inter.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public String test(){
        System.out.println("=========================");
        User inUser = new User();
        inUser.setUsername("test");
        User user = userService.qryUserInfoByCond(inUser);
        System.out.println("用户名：" + user.getPassword());
        return "index";
    }
}
