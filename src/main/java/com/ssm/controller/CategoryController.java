package com.ssm.controller;

import com.ssm.pojo.Category;
import com.ssm.pojo.Product;
import com.ssm.service.CategoryService;
import com.ssm.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CategoryController {
    @Resource
    CategoryService service;

    @Resource
    ProductService service1;

    @RequestMapping("/")
    public String show(Model model){
        List<Category> all = service.getAll();
        model.addAttribute("categoryList",all);
        List<Product> productAll = service1.getProductAll();
        model.addAttribute("specialProductList",productAll);
        return "/fore/homePage";
    }

}
