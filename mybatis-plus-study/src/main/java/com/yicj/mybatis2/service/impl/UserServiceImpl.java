package com.yicj.mybatis2.service.impl;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yicj.mybatis2.entity.User;
import com.yicj.mybatis2.mapper.UserMapper;
import com.yicj.mybatis2.service.IUserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService{
	
	@Autowired
	private UserMapper userMapper ;



	@Override
	public Long insertUserWithBackId(User user) {
		Long id = userMapper.insertUserWithBackId(user);
		System.out.println("================> back id : " + id);
		return id ;
	}


}
