package com.yicj.springmvc.service;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public UserService(){
        System.out.println("UserService Constructor...\n\n\n\n\n\n");
    }
    
    public void save(){
        System.out.println("user service method save() called...");
    }
}
