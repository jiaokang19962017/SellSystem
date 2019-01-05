package com.imooc.enums;

import lombok.Getter;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 14:02 2018/12/2
 * 商品状态
 */
@Getter
public enum ProductStatusEnum implements CodeEnum{
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message=message;
    }

}
