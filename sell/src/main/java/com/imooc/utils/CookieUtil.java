package com.imooc.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 0:17 2018/12/29
 * @ Description：cookie工具
 */
public class CookieUtil {

    /**
     * @Author jiaokang
     * @Description 设置cookie
     * @Date 0:21 2018/12/29
     * @Param 
     * @return 
     **/
    
    public static void set(HttpServletResponse response,String name,String value,int maxAge){
        Cookie cookie = new Cookie(name,value);
        cookie.setPath("/");
        cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }
    /**
     * @Author jiaokang
     * @Description 获取cookie
     * @Date 0:26 2018/12/30
     * @Param 
     * @return 
     **/
    
    public static Cookie  get(HttpServletRequest request,String name){
        Map<String,Cookie> cookieMap = readCookieMap(request);
        if (cookieMap.containsKey(name)){
            return cookieMap.get(name);
        }else {
            return null;
        }
    }

    /**
     * @Author jiaokang
     * @Description 将cookie封装成map
     * @Date 0:30 2018/12/30
     * @Param 
     * @return 
     **/
    
    private static Map<String,Cookie> readCookieMap(HttpServletRequest request){
        Map<String,Cookie> cookieMap = new HashMap<>();
        Cookie[] cookies = request.getCookies();
        if(cookies !=null){
            for (Cookie cookie:cookies){
                cookieMap.put(cookie.getName(),cookie);
            }
        }
        return cookieMap;
    }
}
