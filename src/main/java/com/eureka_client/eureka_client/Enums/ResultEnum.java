package com.eureka_client.eureka_client.Enums;

import lombok.Getter;

/*
@Author Ming Zhou
@Date: 2018/11/17 7:43
*/
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(1,"not exist"),PRODUCT_STOCK_ERROR(2,"No More Inv");
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
