package com.ssm.mapper;

import com.ssm.pojo.Review;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
//评论表接口
public interface ReviewMapper {
    //商品的评论数
    public  int getReviewCount(Integer productId);

    //评论内容
    public List<Review> getReviewAll(@Param("reviewProductId")int reviewProductId);
}
