package com.eureka_client.eureka_client.Service;/*
@Author Ming Zhou
@Date: 2018/11/9 13:30
*/

import com.eureka_client.eureka_client.Entity.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
