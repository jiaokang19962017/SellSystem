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
 * @ Date       ：Created in 9:43 2019/1/5
 * @ Description：
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SellerServiceImplTest {

    private static final String username="admin";
    private static final String password="admin";

    @Autowired
    private SellerServiceImpl sellerService;

    @Test
    public void findSellerInfoByUsername() {
        SellerInfo result = sellerService.findSellerInfoByUsername(username);
        Assert.assertEquals(username,result.getUsername());
    }

    @Test
    public void findSellerInfoByPassword() {
        SellerInfo result = sellerService.findSellerInfoByPassword(password);
        Assert.assertEquals(password,result.getPassword());
    }

    @Test
    public void findSellerInfoByUsernameAndPassword(){
        SellerInfo result = sellerService.findSellerInfoByUsernameAndPassword(username,password);
        Assert.assertEquals(username,result.getUsername());
    }
}