package com.eureka_client.eureka_client.VO;/*
@Author Ming Zhou
@Date: 2018/11/9 12:51
*/

import lombok.Data;

import java.util.List;

@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private List<T> data;
}
