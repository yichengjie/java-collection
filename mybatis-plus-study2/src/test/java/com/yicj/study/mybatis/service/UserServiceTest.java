package com.yicj.study.mybatis.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.yicj.study.mybatis.entity.User;

@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试  
@ContextConfiguration(locations={"classpath:applicationContext.xml"}) 
public class UserServiceTest {
	@Autowired
	private UserService userService ;


	@Test
	public void testGetAllUser() {
		List<User> list = userService.list();
		list.forEach(System.out::println);
	}

}
