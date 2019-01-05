package com.imooc.VO;

import lombok.Data;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 16:51 2018/12/2
 * HTTP请求返回的最外层对象
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码
     **/
    private Integer code;
    /**
     * 提升信息
     **/
    private String msg;
    /***返回信息*/
    private T data;
}
