package com.imooc.repository;

import com.imooc.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 23:17 2018/12/28
 * @ Description：
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo,String> {
    SellerInfo findByOpenid(String openid);
    SellerInfo findByUsername(String username);
    SellerInfo findByPassword(String password);
    SellerInfo findByUsernameAndPassword(String username,String password);
}
