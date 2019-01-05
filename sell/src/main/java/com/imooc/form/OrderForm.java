package com.imooc.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 20:49 2018/12/10
 * @ Description：表单验证
 */
@Data
public class OrderForm {
    @NotEmpty(message = "姓名必填")
    private String name;
    @NotEmpty(message = "手机号必填")
    private String phone;
    @NotEmpty(message = "地址必填")
    private String address;
    @NotEmpty(message = "openid必填")
    private String openid;
    @NotEmpty(message = "购物车不能为空")
    private String items;
}
