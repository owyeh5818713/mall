package com.ssm.controller;

import com.ssm.pojo.Category;
import com.ssm.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CategoryController {
    @Resource
    CategoryService service;

    @RequestMapping("/index")
    public String show(Model model){
        List<Category> all = service.getAll();
        model.addAttribute("categoryList",all);
        return "/fore/homePage";
    }

}
