package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 20:55 2018/12/3
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
    // 查询订单详情
    List<OrderDetail> findByOrderId(String orderId);
}
