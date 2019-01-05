package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 18:13 2018/12/23
 * @ Description：
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass){
        for (T each:enumClass.getEnumConstants()){
            if(code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
