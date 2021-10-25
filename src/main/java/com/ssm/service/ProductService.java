package com.ssm.service;

import com.ssm.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductService {
    //查询6条促销商品信息轮播
    public List<Product> getProductAll();



    //商品类型查询 正则出售或者是促销的商品
    public List<Product> prodyctsClothing(@Param("productCategoryId")int productCategoryId);

    //根据id获取商品查询
    public  List<Product> getProductList(Integer productCategoryId);
}
