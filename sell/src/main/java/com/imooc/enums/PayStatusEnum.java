package com.imooc.enums;

import lombok.Getter;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 20:36 2018/12/3
 */
@Getter
public enum PayStatusEnum implements CodeEnum{
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功")
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
