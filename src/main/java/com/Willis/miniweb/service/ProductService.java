package com.Willis.miniweb.service;

import com.Willis.miniweb.model.Product;
import com.Willis.miniweb.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service

public class ProductService {
    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"IphoneX",40000),
//            new Product(102,"Mulika",4000),
//            new Product(103,"itel",400)));

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }
    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
       repo.save(prod);
    }

    public void deleteProduct(int prodId) {
      repo.deleteById(prodId);
    }
}
