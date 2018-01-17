package com.yl.diy.mapper;

import com.yl.diy.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper  {

    User qryUserInfoByCond(User user);

}
