package com.yicj.mybatis2.mapper;
import com.yicj.mybatis2.Application;
import com.yicj.mybatis2.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//https://www.cnblogs.com/java-zhao/p/5350021.html
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

}
