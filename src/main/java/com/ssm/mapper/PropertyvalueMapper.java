package com.ssm.mapper;

import com.ssm.pojo.Propertyvalue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.map.repository.config.EnableMapRepositories;

import java.util.List;

@Mapper
//商品属性值表
public interface PropertyvalueMapper {
    //根据商品的ID获得对应的参数值
    public List<Propertyvalue> getPropertyvalue(@Param("propertyValueProductId")int propertyValueProductId);
}
