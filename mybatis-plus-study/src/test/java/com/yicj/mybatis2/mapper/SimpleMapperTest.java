package com.yicj.mybatis2.mapper;
import com.yicj.mybatis2.Application;
import com.yicj.mybatis2.entity.User;
import com.yicj.mybatis2.service.IUserService;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//https://www.cnblogs.com/java-zhao/p/5350021.html
//https://www.cnblogs.com/lianggp/p/7573653.html
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SimpleMapperTest {
	@Autowired
    private IUserService userService ;

    @Test
    public void testSelectList(){
    	userService.queryAllUser() ;
    }

    @Test
    public void testSelectCount(){
       userService.countAllUser();
    }
    
    @Test
    public void testInsertUserWithBackId() {
    	User user = new User() ;
    	user.setId(1088250446457389997l);
    	user.setName("zhangsan");
    	user.setAge(22);
    	user.setEmail("xxx@qq.com");
    	user.setCreateTime(LocalDateTime.now());
    	user.setManagerId(1088248166370832385l);
    	userService.insertUserWithBackId(user) ;
    }

}
