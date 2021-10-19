package com.ssm.service.impl;

import com.ssm.mapper.CategoryMapper;
import com.ssm.pojo.Category;
import com.ssm.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    CategoryMapper mapper;

    @Override
    public List<Category> getAll() {
        return mapper.getAll();
    }
}
