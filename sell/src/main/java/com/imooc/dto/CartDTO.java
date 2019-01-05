package com.imooc.dto;

import lombok.Data;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 21:52 2018/12/4
 * @ Description：
 */
@Data
public class CartDTO {
    /**
     *商品id
     **/
    private  String productId;
    /**
     *数量
     **/
    private  Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
