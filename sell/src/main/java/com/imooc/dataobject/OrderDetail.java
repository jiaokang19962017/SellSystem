package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 20:40 2018/12/3
 */
@Entity
@Data
public class OrderDetail {
    @Id
    private String detailId;
    //订单id
    private String orderId;
    // 商品id
    private String productId;
    // 商品名称
    private String productName;
    // 单价
    private BigDecimal productPrice;
    // 商品数量
    private Integer productQuantity;
    // 商品小图
    private String productIcon;
}
