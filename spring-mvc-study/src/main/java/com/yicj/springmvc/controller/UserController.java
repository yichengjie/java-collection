package com.yicj.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.yicj.springmvc.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    
    @RequestMapping("/save")
    public String saveUser(String id ){
        System.out.println("id : " + id);
        userService.save();
        return "hello";
    }
}
