package com.eureka_client.eureka_client.Utils;/*
@Author Ming Zhou
@Date: 2018/11/9 15:43
*/

import com.eureka_client.eureka_client.VO.ProductVO;
import com.eureka_client.eureka_client.VO.ResultVO;

import java.util.List;

public class ResultVOUtil {
    public static ResultVO success(Object obj){
        ResultVO<ProductVO> rvo =  new ResultVO<>();
        rvo.setData((List<ProductVO>) obj);
        rvo.setCode(0);
        rvo.setMsg("Successful");
        return rvo;
    }

}
