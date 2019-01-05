package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 23:27 2018/12/28
 * @ Description：卖家端service
 */
public interface SellerService {
    /**
     * @Author jiaokang
     * @Description 通过openid获取信息
     * @Date 23:29 2018/12/28
     * @Param 
     * @return 
     **/
    
    SellerInfo findSellerInfoByOpenid(String openid);

    /**
     * @Author jiaokang
     * @Description 查询账号信息
     * @Date 9:39 2019/1/5
     * @Param
     * @return
     **/
    SellerInfo findSellerInfoByUsername(String username);

    /**
     * @Author jiaokang
     * @Description 查询密码
     * @Date 9:39 2019/1/5
     * @Param
     * @return
     **/
    SellerInfo findSellerInfoByPassword(String password);

    /**
     * @Author jiaokang
     * @Description 账号密码验证登录信息
     * @Date 10:39 2019/1/5
     * @Param 
     * @return 
     **/
    
    SellerInfo findSellerInfoByUsernameAndPassword(String username,String password);
}
