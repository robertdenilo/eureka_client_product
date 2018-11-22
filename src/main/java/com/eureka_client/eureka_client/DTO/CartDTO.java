package com.eureka_client.eureka_client.DTO;

import lombok.Data;

/*
@Author Ming Zhou
@Date: 2018/11/17 7:26
*/
@Data
public class CartDTO {
    private String productId;
    private Integer productQuantity;

    public CartDTO(){}  //deserialize ???
    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
