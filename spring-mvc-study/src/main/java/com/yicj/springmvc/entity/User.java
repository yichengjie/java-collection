package com.yicj.springmvc.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birth;
    
}