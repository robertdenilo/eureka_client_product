package com.eureka_client.eureka_client.Service;/*
@Author Ming Zhou
@Date: 2018/11/9 12:31
*/

import com.eureka_client.eureka_client.DTO.CartDTO;
import com.eureka_client.eureka_client.Entity.ProductInfo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    List<ProductInfo> findUpAll();
    List<ProductInfo> findList(List<String> productIdList);
    void descreaseStock(List<CartDTO> cartDTOList);
}
