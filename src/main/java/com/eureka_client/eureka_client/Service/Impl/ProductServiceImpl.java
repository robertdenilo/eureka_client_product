package com.eureka_client.eureka_client.Service.Impl;/*
@Author Ming Zhou
@Date: 2018/11/9 12:32
*/

import com.eureka_client.eureka_client.DTO.CartDTO;
import com.eureka_client.eureka_client.Entity.ProductInfo;
import com.eureka_client.eureka_client.Enums.ProductStatusEnum;
import com.eureka_client.eureka_client.Enums.ResultEnum;
import com.eureka_client.eureka_client.Exception.ProductException;
import com.eureka_client.eureka_client.Repository.ProductRepository;
import com.eureka_client.eureka_client.Service.ProductService;
import com.eureka_client.eureka_client.Utils.JsonUtil;
import com.netflix.discovery.converters.Auto;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public List<ProductInfo> findUpAll() {
        return productRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public List<ProductInfo> findList(List<String> productIdList) {
        return productRepository.findByProductIdIn(productIdList);
    }

    @Override
    @Transactional
    public void descreaseStock(List<CartDTO> cartDTOList) {
        for (CartDTO cartDTO : cartDTOList){
            Optional<ProductInfo> productInfoOptional = productRepository.findById(cartDTO.getProductId());

            if (!productInfoOptional.isPresent()){
                throw new ProductException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            ProductInfo productInfo = productInfoOptional.get();
            Integer result = productInfo.getProductStock() -cartDTO.getProductQuantity();
            if (result <0){throw new ProductException(ResultEnum.PRODUCT_STOCK_ERROR);}
            productInfo.setProductStock(result);
            productRepository.save(productInfo);

            //send MQ
            amqpTemplate.convertAndSend("productInfo", JsonUtil.toJson(productInfo));
        }
    }
}
