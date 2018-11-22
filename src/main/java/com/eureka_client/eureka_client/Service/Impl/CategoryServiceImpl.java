package com.eureka_client.eureka_client.Service.Impl;/*
@Author Ming Zhou
@Date: 2018/11/9 13:32
*/

import com.eureka_client.eureka_client.Entity.ProductCategory;
import com.eureka_client.eureka_client.Repository.ProductCategoryRepository;
import com.eureka_client.eureka_client.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }


}
