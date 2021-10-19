package com.ssm.service;

import com.ssm.pojo.Product;

import java.util.List;

public interface ProductService {
    //查询6条促销商品信息轮播
    public List<Product> getProductAll();
}
