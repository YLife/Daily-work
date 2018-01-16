package com.yl.diy.service.impl;

import com.yl.diy.domain.User;
import com.yl.diy.mapper.UserMapper;
import com.yl.diy.service.inter.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User qryUserInfoByCond(User user) {
        return userMapper.qryUserInfoByCond(user);
    }

}
