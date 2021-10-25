package com.ssm.service;

import com.ssm.pojo.Productimage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductimageService {
    //获取商品图片
    public List<Productimage> getCommodity(@Param("productimageProductId")int productimageProductId);

    //查询每个商品的预览图
    public List<Productimage> getProductImagePreview(@Param("productimageProductId") int productimageProductId);

}
