package com.yicj.springmvc.controller;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajax")
//使用Ajax调用
public class AjaxUseController {
	//pass the parameters to front-end using ajax
    @GetMapping("/index")
    public void getPerson(String name,PrintWriter pw){
        pw.write("hello,"+name);        
    }
}
