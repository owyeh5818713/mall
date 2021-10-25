package com.ssm.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
//订单明细表接口
public interface ProductorderitemMapper {
    //搜索商品的成交数
    public int getProductorderItemCount(Integer productorId);
}
