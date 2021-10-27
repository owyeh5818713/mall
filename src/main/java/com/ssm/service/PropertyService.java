package com.ssm.service;

import com.ssm.pojo.Property;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PropertyService {
    //商品参数
    public List<Property> getProperty(@Param("propertyCategoryId")int propertyCategoryId);
}
