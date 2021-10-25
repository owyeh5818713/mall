package com.ssm.service.impl;

import com.ssm.mapper.ReviewMapper;
import com.ssm.service.ReviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Resource
    ReviewMapper mapper;

    @Override
    public int getReviewCount(Integer productId) {
        return mapper.getReviewCount(productId);
    }
}
