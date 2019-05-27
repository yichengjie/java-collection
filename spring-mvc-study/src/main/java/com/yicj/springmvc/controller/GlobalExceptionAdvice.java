package com.yicj.springmvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
//处理全局异常（所有Controller）
public class GlobalExceptionAdvice {
	
	@ExceptionHandler
    public ModelAndView exceptionHandler(Exception ex){
		ex.printStackTrace();
        ModelAndView mv = new ModelAndView("/error");
        mv.addObject("exception", ex);
        System.out.println("in testControllerAdvice");
        return mv;
    }

}
