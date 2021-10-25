package com.ssm.controller;

import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
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



    @RequestMapping(value = "/register",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String getRegister(User user){
        int i = userService.addUser(user);
        if(i>0){
            return "ok";
        }else{
            return "no";
        }
    }


    @RequestMapping("/userDetail")
    public String userDetails(HttpSession session, Model model){
        if(session==null){
            return "/fore/loginPage";
        }else{
            return "/fore/userDetails";
        }
    }



}
