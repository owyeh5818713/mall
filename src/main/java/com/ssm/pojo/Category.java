package com.ssm.pojo;

import lombok.Data;

import java.util.List;

@Data
//商品类别表
public class Category {
private int categoryId; //主键
private String categoryName; //名称
private String categoryImageSrc; //图片
private List<Product> productList;
}
