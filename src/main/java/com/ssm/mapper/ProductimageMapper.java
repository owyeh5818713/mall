package com.ssm.mapper;

import com.ssm.pojo.Productimage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
//商品图片表
public interface ProductimageMapper {

    //获取商品图片
    public List<Productimage> getCommodity(@Param("productimageProductId")int productimageProductId);

    //查询每个商品的预览图
    public List<Productimage> getProductImagePreview(@Param("productimageProductId") int productimageProductId);

}
