package com.ssm.pojo;

import lombok.Data;

@Data
//商品属性值表
public class Propertyvalue {
    private int propertyValueId;//主键
    private String propertyValueValue;//属性值
    private int propertyValuePropertyId;//属性值所属的属性编号
    private int propertyValueProductId;//属性值所属的商品编号
}
