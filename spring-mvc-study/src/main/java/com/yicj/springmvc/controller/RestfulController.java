package com.yicj.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/rest")
//RESTFul风格的SringMVC
public class RestfulController {
	
	 @RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	    public String get(@PathVariable("id") Integer id){
	        System.out.println("get: "+id);
	        return "/hello";
	    }
	    
	    @RequestMapping(value="/user/{id}",method=RequestMethod.POST)
	    public String post(@PathVariable("id") Integer id){
	        System.out.println("post: "+id);
	        return "/hello";
	    }
	    
	    @RequestMapping(value="/user/{id}",method=RequestMethod.PUT)
	    public String put(@PathVariable("id") Integer id){
	        System.out.println("put: "+id);
	        return "/hello";
	    }
	    
	    @RequestMapping(value="/user/{id}",method=RequestMethod.DELETE)
	    public String delete(@PathVariable("id") Integer id){
	        System.out.println("delete: "+id);
	        return "/hello";
	    }
}
