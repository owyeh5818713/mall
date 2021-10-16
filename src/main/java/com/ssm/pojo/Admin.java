package com.ssm.pojo;

import lombok.Data;

@Data
//管理员表
public class Admin {
    private int adminId; //主键
    private String adminName; //账号
    private String adminNickname; //昵称
    private String adminPassword; //密码
    private String  adminProfilePictureSrc; //头像
}
