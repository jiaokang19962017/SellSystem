package com.imooc.service.impl;

import com.imooc.dataobject.SellerInfo;
import com.imooc.repository.SellerInfoRepository;
import com.imooc.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 23:29 2018/12/28
 * @ Description：
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository sellerInfoRepository;



    /**
     * @param openid
     * @return
     * @Author jiaokang
     * @Description 通过openid获取信息
     * @Date 23:29 2018/12/28
     * @Param
     */
    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return sellerInfoRepository.findByOpenid(openid);
    }

    /**
     * @param username
     * @return
     * @Author jiaokang
     * @Description 查询账号信息
     * @Date 9:39 2019/1/5
     * @Param
     */
    @Override
    public SellerInfo findSellerInfoByUsername(String username) {
        return sellerInfoRepository.findByUsername(username);
    }

    /**
     * @param password
     * @return
     * @Author jiaokang
     * @Description 查询密码
     * @Date 9:39 2019/1/5
     * @Param
     */
    @Override
    public SellerInfo findSellerInfoByPassword(String password) {
        return sellerInfoRepository.findByPassword(password);
    }

    /**
     * @param username
     * @param password
     * @return
     * @Author jiaokang
     * @Description 账号密码验证登录信息
     * @Date 9:50 2019/1/5
     * @Param
     */
    @Override
    public SellerInfo findSellerInfoByUsernameAndPassword(String username, String password) {
        return sellerInfoRepository.findByUsernameAndPassword(username,password);
    }
}
