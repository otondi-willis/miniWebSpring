package com.Willis.miniweb.controller;

import com.Willis.miniweb.model.Product;
import com.Willis.miniweb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

public class ProductController {
    @Autowired
    ProductService service;
    @RequestMapping("/products")

    public List<Product> getProducts(){
        return service.getProducts();
    }
    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);

    }
    @PostMapping("/products")
    public void addProduct(Product prod){
        System.out.println(prod);
        service.addProduct(prod);
    }
}
