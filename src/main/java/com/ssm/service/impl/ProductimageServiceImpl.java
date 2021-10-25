package com.ssm.service.impl;

import com.ssm.mapper.ProductimageMapper;
import com.ssm.pojo.Productimage;
import com.ssm.service.ProductService;
import com.ssm.service.ProductimageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductimageServiceImpl implements ProductimageService {
    @Resource
    ProductimageMapper mapper;

    @Override
    public List<Productimage> getCommodity(int productimageProductId) {
        return mapper.getCommodity(productimageProductId);
    }

    @Override
    public List<Productimage> getProductImagePreview(int productimageProductId) {
        return mapper.getProductImagePreview(productimageProductId);
    }
}
