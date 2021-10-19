package com.ssm.mapper;

import com.ssm.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
//商品类别表接口
public interface CategoryMapper {
    //首页商品分类
    public List<Category> getAll();
}
