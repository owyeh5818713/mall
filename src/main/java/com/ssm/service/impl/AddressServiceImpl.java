package com.ssm.service.impl;

import com.ssm.mapper.AddressMapper;
import com.ssm.pojo.Address;
import com.ssm.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Resource
    AddressMapper mapper;

    @Override
    public List<Address> getProvinceAddress() {
        return mapper.getProvinceAddress();
    }

    @Override
    public List<Address> getCityAddress(String addressRegionId) {
        return mapper.getCityAddress(addressRegionId);
    }

    @Override
    public List<Address> getAreaAddress(String addressRegionId) {
        return mapper.getAreaAddress(addressRegionId);
    }
}
