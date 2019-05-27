package com.yicj.springmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.yicj.springmvc.entity.Person;


@Controller
@RequestMapping("passParam")
//向前台传递参数
public class PassParamToFrontEnd {
	//向前台传递参数
	//pass the parameters to front-end
    @RequestMapping("/index")
    public String showPerson(Map<String,Object> map){
        Person p =new Person();
        map.put("p", p);
        p.setAge(20);
        p.setName("jayjay");
        return "pass-param";
    }
   
}
