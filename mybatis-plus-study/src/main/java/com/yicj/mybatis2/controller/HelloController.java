package com.yicj.mybatis2.controller;

import com.yicj.mybatis2.entity.User;
import com.yicj.mybatis2.mapper.UserMapper;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {



    @GetMapping("/hello")
    public String hello(){


        return "hello" ;
    }


}
