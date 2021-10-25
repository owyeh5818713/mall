package com.ssm.service;

import com.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    //用户登录
    public User getLogin(@Param("userName")String userName, @Param("userPassword")String userPassword);

    //用户注册
    public int addUser(User user);

    //用户个人信息展示
    public User getInformation(@Param("userId")int userId);

}
