package com.imooc.handler;

import com.imooc.config.ProjectUrlConfig;
import com.imooc.exception.SellerAuthorizeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 21:55 2019/1/2
 * @ Description：校验异常捕获
 */
@ControllerAdvice
public class SellExceptionHandler {

    @Autowired
    private ProjectUrlConfig projectUrlConfig;

    // 拦截登录异常
    @ExceptionHandler(value = SellerAuthorizeException.class)
    public ModelAndView handlerAuthorizeException(){
//        return new ModelAndView("redirect:"
//        .concat(projectUrlConfig.getSell())
//        .concat("/sell/wechat/qrAuthorize")
//        .concat("?returnUrl")
//        .concat(projectUrlConfig.getSell()).concat("/sell/seller/login"));
        return new ModelAndView("common/login");
    }
}
