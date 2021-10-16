package com.ssm.pojo;

import lombok.Data;

@Data
//订单明细表
public class Productorderitem {
    private int productorderitemId;//主键
    private int productorderitemNumber;//数量
    private float productorderitemPrice;//总价格
    private int productorderitemProductId;//订单明细项关联的商品编号
    private int productorderitemOrderId;//订单明细项关联的订单编号
    private int productorderitemUserId;//订单明细项关联的用户编号
    private String productorderitemUserMessage;//备注
}
