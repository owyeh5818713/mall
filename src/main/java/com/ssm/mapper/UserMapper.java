package com.ssm.mapper;

import com.ssm.pojo.User;
import com.sun.deploy.panel.ITreeNode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
//用户表接口
public interface UserMapper {
    public User getLogin(@Param("userName")String userName,@Param("userPassword")String userPassword);

    //用户注册
    public int addUser(User user);

    //用户个人信息展示
    public User getInformation(@Param("userId")int userId);

    //用户查询
    public User getUser(@Param("userId")int userId);

}
