package com.example.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

//    @GetMapping("/item/{productId}")
//    Product productStockCheck(@PathVariable(value = "productId") Long productId) {
//        return  this.productService.getProductById(productId);
//    }

    @GetMapping("/product/{productId}")
    Product productStockCheck1(@PathVariable(value = "productId") Long productId) {
        return  this.productService.getProductById(productId);
    }
}
