package com.eureka_client.eureka_client.Repository;/*
@Author Ming Zhou
@Date: 2018/11/9 12:12
*/

import com.eureka_client.eureka_client.Entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList   );
}
