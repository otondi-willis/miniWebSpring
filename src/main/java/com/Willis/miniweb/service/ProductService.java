package com.Willis.miniweb.service;

import com.Willis.miniweb.model.Product;

import java.util.Arrays;
import java.util.List;

public class ProductService {
    List<Product> products = Arrays.asList(new Product(101,"IphoneX",40000),
            new Product(102,"Mulika",4000));
    public List<Product> getProducts(){
        return null;
    }
}
