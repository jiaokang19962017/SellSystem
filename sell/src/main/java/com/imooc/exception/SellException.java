package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 21:18 2018/12/4
 * @ Description：统一异常处理类
 */
public class SellException extends RuntimeException{
    private  Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
    public SellException(Integer code,String message){
        super(message);
        this.code=code;
    }

}
