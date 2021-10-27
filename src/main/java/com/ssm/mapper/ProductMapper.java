package com.ssm.mapper;

import com.ssm.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
//商品信息表
public interface ProductMapper {
    //查询6条促销商品信息轮播
    public List<Product> getProductAll();

    //商品类型查询 正则出售或者是促销的商品
    public List<Product> prodyctsClothing(@Param("productCategoryId")int productCategoryId);

    //根据id获取商品查询
    public  List<Product> getProductList(Integer productCategoryId);

    //搜索栏查询
    public List<Product> getSearchAll(@Param("productName")String productName,
                                      @Param("productCategoryId")Integer productCategoryId);

    //根据商品的ID查询商品的信息,商品详情
    public Product getProductDetails(@Param("productId")int productId);






}
