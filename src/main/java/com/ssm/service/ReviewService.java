package com.ssm.service;

import com.ssm.pojo.Review;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReviewService {
    //商品的评论数
    public  int getReviewCount(Integer productId);

    //评论内容
    public List<Review> getReviewAll(@Param("reviewProductId")int reviewProductId);
}
