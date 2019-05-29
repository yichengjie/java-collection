package com.yicj.mybatis2.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@TableName("user")
public class User {

    //主键
    private Long id ;
    //姓名
    private String name ;
    //年龄
    private Integer age ;
    //邮箱
    private String email ;
    //直属上级
    private Long managerId ;
    //创建事件
    private LocalDateTime createTime ;

    @TableField(exist = false)
    private String remark ;

 }
