package com.ssm.controller;

import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/tologin")
    public String tologin(){
        return "/fore/loginPage";
    }

    @RequestMapping("/toshow")
    public String tologin2(){
        return "/fore/homePage";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(String userName, String userPassword, HttpSession session){
        User login=userService.getLogin(userName,userPassword);
        if (login!=null){
            session.setAttribute("user",login);
            return "ok";
        }else {
            return "/fore/loginPage";
        }
    }

}
