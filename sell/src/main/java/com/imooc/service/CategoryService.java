package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 10:10 2018/12/2
 */
public interface CategoryService {

  ProductCategory findOne(Integer categoryId);

  List<ProductCategory> findAll();

  List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryType);

  ProductCategory save(ProductCategory productCategory);
}
