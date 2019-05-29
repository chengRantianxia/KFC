package com.guangc.kfc.kfc.web.controller;

import com.guangc.kfc.kfc.bean.Product;
import com.guangc.kfc.kfc.service.IProductService;
import com.guangc.kfc.kfc.utils.Message;
import com.guangc.kfc.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("findAll")
    public Message findAll(){
        List<Product> list=productService.findAll();
        return MessageUtil.success(list);
    }

    @GetMapping("findProductById")
    public Message findProductById(Long id){
        Product product=productService.findProductById(id);
        return MessageUtil.success(product);
    }

    @PostMapping("saveOrupdateProduct")
    public Message saveOrupdateProduct(Product product){
        productService.saveOrupdateProduct(product);
        return MessageUtil.success("success");
    }

    @GetMapping("deleteProductById")
    public Message deleteProductById(Long id){
        productService.deleteProductById(id);
        return MessageUtil.success("success");
    }
}
