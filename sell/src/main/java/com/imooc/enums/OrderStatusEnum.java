package com.imooc.enums;

import lombok.Getter;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 20:31 2018/12/3
 */
@Getter
public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "新订单"),

    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }}
