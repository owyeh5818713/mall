package com.ssm.service.impl;

import com.ssm.mapper.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper mapper;

    @Override
    public User getLogin(String userName, String userPassword) {
        return mapper.getLogin(userName,userPassword);
    }

    @Override
    public int addUser(User user) {
        return mapper.addUser(user);
    }

    @Override
    public User getInformation(int userId) {
        return mapper.getInformation(userId);
    }

    @Override
    public User getUser(int userId) {
        return mapper.getUser(userId);
    }
}
