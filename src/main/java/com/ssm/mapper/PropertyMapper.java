package com.ssm.mapper;

import com.ssm.pojo.Property;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
//商品属性表接口
public interface PropertyMapper {
    //商品参数
    public List<Property> getProperty(@Param("propertyCategoryId")int propertyCategoryId);
}
