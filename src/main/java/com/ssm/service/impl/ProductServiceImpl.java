package com.ssm.service.impl;

import com.ssm.mapper.ProductMapper;
import com.ssm.pojo.Product;
import com.ssm.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    ProductMapper mapper;

    @Override
    public List<Product> getProductAll() {
        return mapper.getProductAll();
    }

    @Override
    public List<Product> prodyctsClothing(int productCategoryId) {
        return mapper.prodyctsClothing(productCategoryId);
    }

    @Override
    public List<Product> getProductList(Integer productCategoryId) {
        return mapper.getProductList(productCategoryId);
    }
}
