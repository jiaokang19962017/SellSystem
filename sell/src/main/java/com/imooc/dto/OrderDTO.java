package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import com.imooc.utils.EnumUtil;
import com.imooc.utils.serializer.Data2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 23:00 2018/12/3
 */
@Data
public class OrderDTO {

    /**
     * 订单id
     **/
    private String orderId;
    /**
     * 买家名字
     **/
    private String buyerName;
    /**
     * 买家手机号
     **/
    private String buyerPhone;
    /**
     * 买家地址
     **/
    private String buyerAddress;
    /**
     * 买家微信id
     **/
    private String buyerOpenid;
    /**
     * 订单总金额
     **/
    private BigDecimal orderAmount;
    /**
     * 订单状态 默认为0新下单
     **/
    private Integer orderStatus;
    /**
     * 支付状态 默认为0未支付
     **/
    private Integer payStatus;
    /**
     * 订单创建时间
     **/
    @JsonSerialize(using = Data2LongSerializer.class)
    private Date createTime;
    /**
     * 订单更新时间
     **/
    @JsonSerialize(using = Data2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum(){
        return EnumUtil.getByCode(orderStatus,OrderStatusEnum.class);
    }
    @JsonIgnore
    public PayStatusEnum getPayStatusEnum(){
        return EnumUtil.getByCode(payStatus,PayStatusEnum.class);
    }
}
