package com.imooc.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 22:10 2018/12/28
 * @ Description：
 */
@Data
public class ProductForm {

    private String productId;
    /**
     * 名字
     **/
    private String productName;
    /**
     * 单价
     **/
    private BigDecimal productPrice;
    /**
     * 库存
     **/
    private Integer productStock;
    /**
     * 描述
     **/
    private String productDescription;
    /**
     * 小图
     **/
    private String productIcon;
    /**
     * 状态: 0.正常 1.下架
     **/
    private Integer productStatus;

    /**
     * 类目编号
     **/
    private Integer categoryType;


}
