package com.eureka_client.eureka_client.VO;/*
@Author Ming Zhou
@Date: 2018/11/9 12:52
*/

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProductVO {
    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;
    @JsonProperty("food")
    List<ProductInfoVO> productInfoVOList;


}
