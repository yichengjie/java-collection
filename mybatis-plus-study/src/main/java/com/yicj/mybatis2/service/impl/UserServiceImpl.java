package com.yicj.mybatis2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yicj.mybatis2.entity.User;
import com.yicj.mybatis2.mapper.UserMapper;
import com.yicj.mybatis2.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserMapper userMapper ;
	 
	@Override
	public List<User> queryAllUser() {
		List<User> list = userMapper.selectList(null) ;
	    list.forEach(System.out::println);
		return list;
	}

	@Override
	public Integer countAllUser() {
		System.out.println("hello world");
        Integer count = userMapper.selectCount(null) ;
        System.out.println("=============> "  + count);
        return count ;
	}

	@Override
	public Long insertUserWithBackId(User user) {
		Long id = userMapper.insertUserWithBackId(user);
		System.out.println("================> back id : " + id);
		return id ;
	}

	@Override
	public Integer insert(User user) {
		return userMapper.insert(user);
	}

}
