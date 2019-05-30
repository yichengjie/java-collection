package com.yicj.mybatis2.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yicj.mybatis2.Application;
import com.yicj.mybatis2.entity.User;
import com.yicj.mybatis2.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserMapperTest {
	
	@Autowired
    private UserService userService ;
	
	@Test
	public void testSelectAll() {
		 List<User> list = userService.list();
		 list.forEach(System.out::println);
	}
	
	@Test
	public void testSelecById() {
		User u = userService.getById(1094590409767661570L) ;
		System.out.println("=====================");
		System.out.println(u);
		System.out.println("=====================");
	}
}
