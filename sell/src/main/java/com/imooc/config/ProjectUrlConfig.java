package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 0:09 2018/12/30
 * @ Description：
 */
@Data
@ConfigurationProperties(prefix = "projecturl")
@Component
public class ProjectUrlConfig {
    /**
     * 点餐系统
     */
    public String sell;
}
