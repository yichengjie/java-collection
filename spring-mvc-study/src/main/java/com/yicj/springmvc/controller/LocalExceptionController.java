package com.yicj.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/localException")
//处理局部异常（Controller内）
public class LocalExceptionController {
	
	@ExceptionHandler
    public ModelAndView exceptionHandler(Exception ex){
        ModelAndView mv = new ModelAndView("/error");
        mv.addObject("exception", ex);
        System.out.println("in testExceptionHandler");
        return mv;
    }
    
    @RequestMapping("/index")
    public String error(){
        int i = 5/0;
        return "hello";
    }
}
