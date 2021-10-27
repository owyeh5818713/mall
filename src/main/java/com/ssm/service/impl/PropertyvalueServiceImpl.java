package com.ssm.service.impl;

import com.ssm.mapper.PropertyvalueMapper;
import com.ssm.pojo.Propertyvalue;
import com.ssm.service.PropertyvalueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PropertyvalueServiceImpl implements PropertyvalueService {
    @Resource
    PropertyvalueMapper mapper;

    @Override
    public List<Propertyvalue> getPropertyvalue(int propertyValueProductId) {
        return mapper.getPropertyvalue(propertyValueProductId);
    }
}
