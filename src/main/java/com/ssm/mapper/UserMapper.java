package com.ssm.mapper;

import com.ssm.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
//用户表接口
public interface UserMapper {
    public User getLogin(@Param("adminName")String adminName,@Param("adminPassword")String adminPassword);

}
