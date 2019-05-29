package com.yicj.mybatis2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@TableName("user")
public class User {

    //主键
    //@TableId(type = IdType.AUTO)//数据库自增
    //@TableId(type = IdType.UUID) String可以设置为UUID
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
