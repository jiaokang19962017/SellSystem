package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import com.imooc.repository.ProductInfoRespository;
import com.imooc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 13:58 2018/12/2
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRespository respository;

    @Override
    public ProductInfo findOne(String productId) {
        return respository.findById(productId).orElse(null);
    }

    /**
     * 查询所有在架商品
     *
     * @retun
     **/
    @Override
    public List<ProductInfo> findUpAll() {
        return respository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return respository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return respository.save(productInfo);
    }

    @Override
    @Transactional
    public void increaseStock(List<CartDTO> cartDTOList) {
        for(CartDTO cartDTO:cartDTOList){
            ProductInfo productInfo = respository.findById(cartDTO.getProductId()).orElse(null);
            if (productInfo==null){
                throw  new SellException(ResultEnum.PRODUCT_NOT_EXIT);
            }
            Integer result = productInfo.getProductStock()+cartDTO.getProductQuantity();
            productInfo.setProductStock(result);
            respository.save(productInfo);
        }
    }

    @Override
    @Transactional
    public void decreaseStock(List<CartDTO> cartDTOList) {
        for (CartDTO cartDTO:cartDTOList){
           ProductInfo productInfo = respository.findById(cartDTO.getProductId()).orElse(null);
           if (productInfo==null){
                throw  new SellException(ResultEnum.PRODUCT_NOT_EXIT);
           }
          Integer result = productInfo.getProductStock() - cartDTO.getProductQuantity();
           if(result<0){
               throw new SellException(ResultEnum.PRODUCT_STOCK_ERROR);
           }
           productInfo.setProductStock(result);
           respository.save(productInfo);
        }
    }

    @Override
    public ProductInfo onSale(String productId) {
       ProductInfo productInfo = respository.findById(productId).orElse(null);
       if (productInfo == null){
           throw new SellException(ResultEnum.PRODUCT_NOT_EXIT);
       }
       if(productInfo.getProductEnum() == ProductStatusEnum.UP){
           throw new SellException(ResultEnum.PRODUCT_STATUS_ERROR);
       }
       // 更新
        productInfo.setProductStatus(ProductStatusEnum.UP.getCode());
        return respository.save(productInfo);
    }

    @Override
    public ProductInfo offSale(String productId) {
        ProductInfo productInfo = respository.findById(productId).orElse(null);
        if (productInfo == null){
            throw new SellException(ResultEnum.PRODUCT_NOT_EXIT);
        }
        if(productInfo.getProductEnum() == ProductStatusEnum.DOWN){
            throw new SellException(ResultEnum.PRODUCT_STATUS_ERROR);
        }
        // 更新
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        return respository.save(productInfo);
    }
}
