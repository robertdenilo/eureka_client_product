package com.eureka_client.eureka_client.Entity;

import lombok.Data;

import java.math.BigDecimal;

/*
@Author Ming Zhou
@Date: 2018/11/30 11:34
*/
@Data
public class ProductInfoOutput {
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStatus;
    private Integer productStock;
}
