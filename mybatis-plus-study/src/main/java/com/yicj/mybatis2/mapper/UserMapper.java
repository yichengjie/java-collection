package com.yicj.mybatis2.mapper;

import org.springframework.stereotype.Component;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yicj.mybatis2.entity.User;

@Component
public interface UserMapper extends BaseMapper<User> {
	public Long insertUserWithBackId(User user) ;
}
