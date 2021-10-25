package com.ssm.controller;

import com.ssm.pojo.Category;
import com.ssm.pojo.Product;
import com.ssm.service.CategoryService;
import com.ssm.service.ProductService;
import com.ssm.service.ProductimageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CategoryController {
    @Resource
    CategoryService categoryService;

    @Resource
    ProductService productService;

    @Resource
    ProductimageService productimageService;

    @RequestMapping("/")
    public String show(Model model){
        List<Category> categoryList = categoryService.getAll();
        List<Product> productAll = productService.getProductAll();
        for (int i=0;i<categoryList.size();i++){
            Category category=categoryList.get(i);
            category.setProductList(productService.prodyctsClothing(category.getCategoryId()));
            for (int j=0;j<category.getProductList().size();j++){
                Product product = category.getProductList().get(j);
                product.setSingleProductImageList(productimageService.getCommodity(product.getProductId()));
            }
        }
        model.addAttribute("categoryList",categoryList);

        model.addAttribute("specialProductList",productAll);
        return "/fore/homePage";
    }

}
