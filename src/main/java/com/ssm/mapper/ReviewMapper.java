package com.ssm.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
//评论表接口
public interface ReviewMapper {
    //商品的评论数
    public  int getReviewCount(Integer productId);
}
