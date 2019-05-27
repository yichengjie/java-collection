package com.yicj.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/redirect")
//在Controller中使用redirect方式处理请求
public class RedirectController {
	 //redirect 
    @RequestMapping("/index")
    public String redirect(){
        return "redirect:/hello";
    }
}
