package com.eureka_client.eureka_client.Repository;/*
@Author Ming Zhou
@Date: 2018/11/9 11:13
*/

import com.eureka_client.eureka_client.Entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo>  findByProductStatus(Integer productStatus);
    List<ProductInfo>  findByProductIdIn(List<String> list);

}
