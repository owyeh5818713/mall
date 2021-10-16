package com.ssm.pojo;

import lombok.Data;
import org.omg.CORBA.PRIVATE_MEMBER;
@Data

//商品图片表
public class Productimage {
    private int productimageId; //主键
    private Integer productimageType; //图片类型
    private String productimageSrc; //图片路径
    private int productimageProductId; //图片关联的商品编号
}
