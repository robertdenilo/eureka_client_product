package com.eureka_client.eureka_client.Repository;

import com.eureka_client.eureka_client.Entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/*
@Author Ming Zhou
@Date: 2018/11/9 12:20
*/

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;
    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> lst = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(111,222));
        Assert.assertTrue(lst.size()>0);
    }
}