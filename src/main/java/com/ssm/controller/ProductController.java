package com.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.ssm.pojo.*;
import com.ssm.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
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

    @Resource
    UserService userService;

    @Resource
    PropertyService propertyService;

    @Resource
    PropertyvalueService propertyvalueService;


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
    public String searchAll(String productName,Integer categoryId,Model model){
        List<Product> searchAll = productService.getSearchAll(productName,categoryId);
        List<Category> all = categoryService.getAll();
        model.addAttribute("searchValue",productName);
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

    @RequestMapping("/productdetails")
    public String getproductdetails(@RequestParam("productId")int productId,Model model){
        Product product=productService.getProductDetails(productId);//商品详细查询
        product.setSingleProductImageList(productimageService.getProductImagePreview(productId));//商品预览图片
        product.setProductSaleCount(productorderitemService.getProductorderItemCount(productId));
        product.setProductReviewCount(reviewService.getReviewCount((productId)));
        product.setReviewList(reviewService.getReviewAll(productId));
        product.setDetailProductImageList(productimageService.getProductImageDetail2(productId));
        for(int i=0;i<product.getReviewList().size();i++){
            Review review = product.getReviewList().get(i);
            review.setReviewUser(userService.getUser(review.getReviewUserId()));
        }

        model.addAttribute("product",product);

        //商品参数
        List<Property> propertyList = propertyService.getProperty(product.getProductCategoryId());//商品属性集合
        List<Propertyvalue> propertyValues = propertyvalueService.getPropertyvalue(productId);//商品属性值集合
        for (int i=0;i<propertyList.size();i++){
            for (Property property : propertyList) {
                List<Propertyvalue> list=new ArrayList<>();
                for (Propertyvalue value : propertyValues) {
                    if (property.getPropertyId()==value.getPropertyValuePropertyId()){
                        list.add(value);
                    }
                }
                property.setPropertyValueList(list);
            }
        }
        model.addAttribute("propertyList",propertyList);
        return "fore/productDetailsPage";
    }






}
