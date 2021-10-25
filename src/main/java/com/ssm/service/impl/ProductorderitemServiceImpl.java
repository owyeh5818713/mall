package com.ssm.service.impl;

import com.ssm.mapper.ProductorderitemMapper;
import com.ssm.service.ProductorderitemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class ProductorderitemServiceImpl implements ProductorderitemService {
    @Resource
    ProductorderitemMapper mapper;


    @Override
    public int getProductorderItemCount(Integer productorId) {
        return mapper.getProductorderItemCount(productorId);
    }
}
