package com.yicj.mybatis2.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yicj.mybatis2.entity.User;

public interface IUserService extends IService<User> {
	//List<User> queryAllUser() ;
	//Integer countAllUser() ;
	Long insertUserWithBackId(User user) ;
	//Integer insert(User user) ;
	//List<User> selectByMap(Map<String,Object> map) ;
	//List<User> selectByWrapper(QueryWrapper queryWrapper) ;
	//IPage<User> selectPage(QueryWrapper queryWrapper, IPage<User> page) ;

}
