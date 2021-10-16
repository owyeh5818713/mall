package com.ssm.pojo;

import lombok.Data;

@Data
//评论表
public class Review {
    private int reviewId;//主键
    private String reviewContent;//评价内容
    private String reviewCreatedate;//评价创建日期
    private int reviewUserId;//评价人
    private int reviewProductId;//评价关联的商品编号
    private int reviewOrderItemId;//评价关联的订单明细项编号
}
