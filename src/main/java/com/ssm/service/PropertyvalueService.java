package com.ssm.service;

import com.ssm.pojo.Propertyvalue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PropertyvalueService {
    //根据商品的ID获得对应的参数值
    public List<Propertyvalue> getPropertyvalue(@Param("propertyValueProductId")int propertyValueProductId);
}
