package com.yicj.mybatis2.service;

import java.util.List;

import com.yicj.mybatis2.entity.User;

public interface IUserService {
	List<User> queryAllUser() ;
	Integer countAllUser() ;
	Long insertUserWithBackId(User user) ;
}
