package com.ssm.pojo;

import lombok.Data;

import java.util.List;

@Data
//商品属性表
public class Property {
    private int propertyId;//主键
    private String propertyName;//属性名
    private int propertyCategoryId;//属性所属类别
    private List<Propertyvalue> propertyValueList;//属性值的集合
}
