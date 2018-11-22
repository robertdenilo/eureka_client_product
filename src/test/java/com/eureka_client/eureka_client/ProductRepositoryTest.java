package com.eureka_client.eureka_client;

import com.eureka_client.eureka_client.Entity.ProductInfo;
import com.eureka_client.eureka_client.Repository.ProductRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/*
@Author Ming Zhou
@Date: 2018/11/9 11:21
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void findByProductStatus() throws Exception{
        List<ProductInfo> lst = productRepository.findByProductStatus(1);
        Assert.assertTrue(lst.size()>0);
    }
}