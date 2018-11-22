package com.eureka_client.eureka_client.Service;

import com.eureka_client.eureka_client.Entity.ProductCategory;
import com.eureka_client.eureka_client.EurekaClientApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/*
@Author Ming Zhou
@Date: 2018/11/9 13:36
*/
@Component
public class CategoryServiceTest extends EurekaClientApplicationTests {
    @Autowired
    private CategoryService categoryService;
    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> lst = categoryService.findByCategoryTypeIn(Arrays.asList(111,333));
        Assert.assertTrue(lst.size()>0);
    }
}