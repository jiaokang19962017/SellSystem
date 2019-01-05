package com.imooc.dataobject;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 23:00 2018/12/1
 * 商品类别
 */
@Entity
@DynamicUpdate
@lombok.Data
public class ProductCategory {

    /**
     * 类目id
     **/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    /**
     * 类目名字
     **/
    private String categoryName;
    /**
     * 类目编号
     **/
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public ProductCategory() {

    }
}
