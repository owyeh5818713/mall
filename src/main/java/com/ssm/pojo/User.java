package com.ssm.pojo;

import lombok.Data;

import javax.annotation.security.DenyAll;

@Data
//用户表
public class User {

    private int userId;//主键
    private String userName;//用户名
    private String userNickName;//用户昵称
    private String  userPassword;//密码
    private String userRealName;//真实姓名
    private Integer userGender;//性别
    private String userBirthday;//生日
    private String userAddress;//收货地址
    private String userHomePlace;//家庭住址
    private String userProfilePictureSrc;//用户头像地址
}
