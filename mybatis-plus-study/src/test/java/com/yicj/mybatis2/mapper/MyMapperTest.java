package com.yicj.mybatis2.mapper;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yicj.mybatis2.entity.Employee;

public class MyMapperTest {
	private ApplicationContext context = 
            new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    private EmployeeMapper employeeMapper = 
            context.getBean("employeeMapper", EmployeeMapper.class);
    @Test
    public void getEmpByIdTest() {
        Employee employee = employeeMapper.selectById(1);
        System.out.println(employee);
    }

}
