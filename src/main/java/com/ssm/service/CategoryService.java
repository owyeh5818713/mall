package com.ssm.service;

import com.ssm.pojo.Category;

import java.util.List;

public interface CategoryService {
    //首页商品分类
    public List<Category> getAll();
}
