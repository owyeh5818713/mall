package com.ssm.mapper;

import com.ssm.pojo.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
//地区表接口
public interface AddressMapper {
    //绑定注册页面的家庭住址
    //绑定省份
    public List<Address> getProvinceAddress();
    //绑定城市
    public List<Address> getCityAddress(String addressRegionId);
    //绑定区
    public List<Address> getAreaAddress(String addressRegionId);

}
