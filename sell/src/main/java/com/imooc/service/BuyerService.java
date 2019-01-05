package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 22:32 2018/12/11
 * @ Description：买家
 */
public interface BuyerService {
    // 查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);
    // 取消订单
    OrderDTO cancelOrder(String openid,String orderId);
}
