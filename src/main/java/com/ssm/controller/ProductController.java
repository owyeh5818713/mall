package com.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.ssm.pojo.Category;
import com.ssm.pojo.Product;
import com.ssm.service.*;
import com.sun.deploy.panel.ITreeNode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Resource
    ProductService productService;

    @Resource
    CategoryService categoryService;

    @Resource
    ReviewService reviewService;

    @Resource
    ProductorderitemService productorderitemService;

    @Resource
    ProductimageService productimageService;



    @RequestMapping("/nav")
    @ResponseBody
    public String nav(@RequestParam("categoryId") int categoryId){
        List<Category> all = categoryService.getAll();
        Map<String,Object> map = new HashMap<>();
        Category category = new Category();
        for(int i=0;i<all.size();i++){
            if(all.get(i).getCategoryId()==categoryId){
                all.get(i).setComplexProductList(productService.getProductList(categoryId));
                category=all.get(i);
            }
        }
        map.put("success",true);
        map.put("category",category);
        return JSON.toJSONString(map);
    }


    @RequestMapping("/search")
    public String searchAll(String productName, Model model){
        List<Product> searchAll = productService.getSearchAll(productName);
        List<Category> all = categoryService.getAll();

        for(int i=0;i<searchAll.size();i++){
            Product product = searchAll.get(i);
            product.setProductReviewCount(reviewService.getReviewCount(product.getProductId()));
            product.setProductSaleCount(productorderitemService.getProductorderItemCount(product.getProductId()));
            product.setSingleProductImageList(productimageService.getProductImagePreview(product.getProductId()));
        }


        model.addAttribute("categoryList",all);
        model.addAttribute("productList",searchAll);
        return "fore/productListPage";
    }






}
