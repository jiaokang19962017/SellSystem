package com.imooc.service.impl;

import com.imooc.dataobject.SellerInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 23:30 2018/12/28
 * @ Description：
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SellerInfoServiceImplTest {

    private static  final String openid="admin";

    @Autowired
    private SellerServiceImpl sellerService;

    @Test
    public void findSellerInfoByOpenid() throws Exception{
        SellerInfo result = sellerService.findSellerInfoByOpenid(openid);
        Assert.assertEquals(openid,result.getOpenid());
    }
}