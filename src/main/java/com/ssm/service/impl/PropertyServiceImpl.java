package com.ssm.service.impl;

import com.ssm.mapper.PropertyMapper;
import com.ssm.pojo.Property;
import com.ssm.service.PropertyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PropertyServiceImpl implements PropertyService {
    @Resource
    PropertyMapper mapper;

    @Override
    public List<Property> getProperty(int propertyCategoryId) {
        return mapper.getProperty(propertyCategoryId);
    }
}
