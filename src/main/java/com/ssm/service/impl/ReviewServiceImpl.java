package com.ssm.service.impl;

import com.ssm.mapper.ReviewMapper;
import com.ssm.pojo.Review;
import com.ssm.service.ReviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Resource
    ReviewMapper mapper;

    @Override
    public int getReviewCount(Integer productId) {
        return mapper.getReviewCount(productId);
    }

    @Override
    public List<Review> getReviewAll(int reviewProductId) {
        return mapper.getReviewAll(reviewProductId);
    }
}
