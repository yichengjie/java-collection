package com.yicj.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {
	
	@GetMapping("index")
	@ResponseBody
	public String index() {
		return "hello world" ;
	}
	
	@GetMapping("hello")
	public String hello() {
		return "hello" ;
	}
	
	@GetMapping("exception")
	public String exception() {
		int a = 1/0 ;
		return "test" ;
	}
	
	
}
