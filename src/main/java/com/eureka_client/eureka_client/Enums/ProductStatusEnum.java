package com.eureka_client.eureka_client.Enums;/*
@Author Ming Zhou
@Date: 2018/11/9 12:29
*/

import lombok.Getter;

@Getter
public enum ProductStatusEnum {
     UP(1,"sell"),
     DOWN(2,"soldout");
     private Integer code;
     private String msg;

    ProductStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
