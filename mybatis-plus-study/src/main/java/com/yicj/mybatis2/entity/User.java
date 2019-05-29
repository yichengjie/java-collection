package com.yicj.mybatis2.entity;

import java.time.LocalDateTime;


//@Data
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getManagerId() {
		return managerId;
	}
	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}
	public LocalDateTime getCreateTime() {
		return createTime;
	}
	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", managerId=" + managerId
				+ ", createTime=" + createTime + "]";
	}

}
