package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 13:53 2018/12/2
 * 商品
 */
public interface ProductService {
    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品
     * @retun
     * **/
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    // todo 加库存
    void increaseStock(List<CartDTO> cartDTOList);

    // todo 减库存
    void  decreaseStock(List<CartDTO> cartDTOList);

    // 上架
    ProductInfo onSale(String productId);

    // 下架
    ProductInfo offSale(String productId);
}
