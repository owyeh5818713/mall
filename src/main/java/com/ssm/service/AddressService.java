package com.ssm.service;

import com.ssm.pojo.Address;

import java.util.List;

public interface AddressService {
    //绑定注册页面的家庭住址
    //绑定省份
    public List<Address> getProvinceAddress();
    //绑定城市
    public List<Address> getCityAddress(String addressRegionId);
    //绑定区
    public List<Address> getAreaAddress(String addressRegionId);

}
