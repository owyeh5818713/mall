package com.ssm.service;

import com.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {

    public User getLogin(@Param("userName")String userName, @Param("userPassword")String userPassword);

}
