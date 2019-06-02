package com.yicj.study.mybatis.service.impl;

import com.yicj.study.mybatis.entity.User;
import com.yicj.study.mybatis.mapper.UserMapper;
import com.yicj.study.mybatis.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yicj
 * @since 2019-06-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
