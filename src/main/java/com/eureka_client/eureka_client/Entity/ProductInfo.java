package com.eureka_client.eureka_client.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/*
@Author Ming Zhou
@Date:2018/11/9 10:52
*/
@Data
@Entity
public class ProductInfo {
    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStatus;
    private Integer productStock;
    private Integer productType;
    private Date createTime;
    private Date updateTime;
}
