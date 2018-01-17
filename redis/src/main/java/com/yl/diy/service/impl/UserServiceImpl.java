package com.yl.diy.service.impl;

import com.alibaba.fastjson.JSON;
import com.yl.diy.domain.User;
import com.yl.diy.mapper.UserMapper;
import com.yl.diy.service.inter.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User qryUserInfoByCond(User user) {
        User outUser;
        Jedis jedis = new Jedis("192.168.207.128", 6379);
        String jsonStr = jedis.get("user");
        if (jsonStr != null) {
            outUser = JSON.parseObject(jsonStr, User.class);
        }else {
            outUser = userMapper.qryUserInfoByCond(user);
            jedis.set("user", JSON.toJSONString(outUser));
        }
        return outUser;
    }

}
