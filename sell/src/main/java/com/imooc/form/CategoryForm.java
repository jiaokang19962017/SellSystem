package com.imooc.form;

import lombok.Data;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 23:04 2018/12/28
 * @ Description：
 */
@Data
public class CategoryForm {

    private Integer categoryId;
    /**
     * 类目名字
     **/
    private String categoryName;
    /**
     * 类目编号
     **/
    private Integer categoryType;
}
