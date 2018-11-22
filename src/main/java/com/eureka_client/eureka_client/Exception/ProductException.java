package com.eureka_client.eureka_client.Exception;

import com.eureka_client.eureka_client.Enums.ResultEnum;

/*
@Author Ming Zhou
@Date: 2018/11/17 7:41
*/
public class ProductException extends RuntimeException {
    private Integer code;
    public ProductException(Integer code, String msg){
        super(msg);
        this.code = code;
    }
    public ProductException(ResultEnum resultEnum){

        super(resultEnum.getMessage());
    }
}
