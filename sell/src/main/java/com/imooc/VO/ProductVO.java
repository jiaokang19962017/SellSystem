package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 17:06 2018/12/2
 * 商品（包含类目）
 */
@Data
public class ProductVO {
    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private  Integer categoryType;
    @JsonProperty("foots")
    private List<ProductInfoVO> productInfoVOList;
}
