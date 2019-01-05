package com.imooc.service;

import com.imooc.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 22:54 2018/12/3
 */
public interface OrderService {
    // 创建订单
    OrderDTO create(OrderDTO orderDTO);
    // 查询单个
    OrderDTO findOne(String orderId);
    // 查询订单列表
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);
    // 取消订单
    OrderDTO cancel(OrderDTO orderDTO);
    // 完结订单
    OrderDTO finish(OrderDTO orderDTO);
    // 支付订单
    OrderDTO paid(OrderDTO orderDTO);
    // 查询全部订单
    Page<OrderDTO> findList(Pageable pageable);
}