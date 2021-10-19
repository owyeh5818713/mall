package com.ssm.mapper;

import com.ssm.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
//用户表接口
public interface UserMapper {
    public User getLogin(@Param("userName")String userName,@Param("userPassword")String userPassword);



}
