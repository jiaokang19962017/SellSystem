package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 20:50 2018/12/3
 * 订单
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
    // 根据openid查询订单
    Page<OrderMaster> findByBuyerOpenid(String BuyerOpenid, Pageable pageable);
}
