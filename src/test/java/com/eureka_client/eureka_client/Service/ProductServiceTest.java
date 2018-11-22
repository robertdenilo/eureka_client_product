package com.eureka_client.eureka_client.Service;

import com.eureka_client.eureka_client.DTO.CartDTO;
import com.eureka_client.eureka_client.Entity.ProductInfo;
import com.eureka_client.eureka_client.EurekaClientApplication;
import com.eureka_client.eureka_client.EurekaClientApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/*
@Author Ming Zhou
@Date: 2018/11/9 12:36
*/
@Component   //No need to @ runwith everytime instead of Component and extends
public class ProductServiceTest extends EurekaClientApplicationTests {
    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> lst = productService.findUpAll();
        Assert.assertTrue(lst.size() > 0);
    }

    @Test
    public void findList() {
        List<ProductInfo> po = productService.findList(Arrays.asList("1"));
        Assert.assertTrue(po.size() > 0);
    }

    @Test
    public void decreaseStock() throws Exception{
        CartDTO cartDTO = new CartDTO("1",2);
        productService.descreaseStock(Arrays.asList(cartDTO));
    }
}