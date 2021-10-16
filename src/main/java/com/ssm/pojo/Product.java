package com.ssm.pojo;

import lombok.Data;

@Data
//商品信息表
public class Product {
    private int productId; //主键
    private String productName; //名称
    private String productTitle; //标题
    private float productPrice; //价格
    private float productSalePrice; //原价
    private String productCreateDate; //促销价
    private int productCategoryId; //类别编号
    private Integer productIsEnabled; //商品状态 0:销售中 1:停售中 2:促销中
}
