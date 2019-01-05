package com.imooc.utils;

import java.util.Random;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 21:36 2018/12/4
 * @ Description：随机数生成
 */
public class KeyUtil {
    /**
     * 生成唯一主键
     * 格式： 时间+随机数
     **/
    public static synchronized String  genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
