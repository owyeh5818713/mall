package com.ssm.pojo;

import lombok.Data;

@Data
//地区表
public class Address {
    private String  addressAreaId; //主键
    private String addressName; //地址的行政区化
    private String  addressRegionId; //父级区划ID
}
