package com.eureka_client.eureka_client.Controller;

import com.eureka_client.eureka_client.DTO.CartDTO;
import com.eureka_client.eureka_client.VO.ProductInfoVO;
import com.eureka_client.eureka_client.VO.ProductVO;
import com.eureka_client.eureka_client.VO.ResultVO;
import com.eureka_client.eureka_client.Entity.ProductCategory;
import com.eureka_client.eureka_client.Entity.ProductInfo;
import com.eureka_client.eureka_client.Service.CategoryService;
import com.eureka_client.eureka_client.Service.ProductService;
import com.eureka_client.eureka_client.Utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/product")
public class ProductConntroller {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO<ProductVO> list(){
        List<ProductInfo> productInfoLst = productService.findUpAll();
        List<Integer> categoryTypeLst = productInfoLst.stream().map(ProductInfo::getProductType).collect(Collectors.toList());
        List<ProductCategory> lstCat =  categoryService.findByCategoryTypeIn(categoryTypeLst);
        List<ProductVO>  prodVOList = new ArrayList<>();
        for (ProductCategory item : lstCat){
            ProductVO prodVo = new ProductVO();
            prodVo.setCategoryName(item.getCategoryName());
            prodVo.setCategoryType(item.getCategoryType());
            List<ProductInfoVO> lstProd = new ArrayList<>();
            for (ProductInfo productInfo:productInfoLst){
                if (productInfo.getProductType().equals(item.getCategoryType())) {
                    ProductInfoVO prodInfoVo = new ProductInfoVO();
                    prodInfoVo.setProductId(productInfo.getProductId());
                    prodInfoVo.setProductName(productInfo.getProductName());
                    prodInfoVo.setProductPrice(productInfo.getProductPrice());
                    //BeanUtils.copyProperties();   //batch copy attr
                    lstProd.add(prodInfoVo);
                }
            }
            prodVo.setProductInfoVOList(lstProd);
            prodVOList.add(prodVo);
        }
        //ResultVO<ProductVO> rvo =  new ResultVO<>();
        //rvo.setData(prodVOList);
        //rvo.setCode(0);
        //rvo.setMsg("Successful");
        //return rvo;
        return ResultVOUtil.success(prodVOList);

    }

    @PostMapping("/listForOrder")
    public List<ProductInfo> listForOrder(@RequestBody List<String> productIdList){
        return productService.findList(productIdList);
    }

    @PostMapping("/decreaseStock")
    public void decreaseStock(@RequestBody List<CartDTO> cartDTOList){
        productService.descreaseStock(cartDTOList);
    }

}
