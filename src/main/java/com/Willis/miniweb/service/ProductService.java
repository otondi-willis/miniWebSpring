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
    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"IphoneX",40000),
            new Product(102,"Mulika",4000),
            new Product(103,"itel",400)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p->p.getProdId()==prodId)
                .findFirst().get();
    }
    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId()==prod.getProdId()){
                index=i;

        }
        products.set(index, prod);}
    }

    public void deleteProduct(int prodId) {
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId()==prodId) {
                index = i;

            }
        products.remove(index);}
    }
}
