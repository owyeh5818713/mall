package com.ssm.pojo;

import lombok.Data;

@Data
//商品订单表
public class Productorder {
    private int productorderId;//主键
    private String productorderCode;//订单编号
    private String productorderAddress;//订单地址
    private String productorderDetailAddress;//订单详细地址
    private String productorderPost;//邮箱
    private String productorderReceiver;//收件人
    private String productorderMobile;//收件人电话
    private String productorderPayDate;//支付日期
    private String productorderDeliveryDate;//运送日期
    private String productorderConfirmDate;//确认收货日期
    private Integer productorderStatus;//订单状态

    private int productorderUserId;
}
