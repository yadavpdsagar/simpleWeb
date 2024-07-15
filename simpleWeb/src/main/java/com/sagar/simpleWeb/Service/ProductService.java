package com.sagar.simpleWeb.Service;

import com.sagar.simpleWeb.Model.Product;

import com.sagar.simpleWeb.repository.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service

public class ProductService {

    @Autowired
    productRepo repo;

    //    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"iphone",500),
//            new Product(1,"sager",202),
//            new Product(2,"samsung",20000),
//            new Product(3,"mixami",20200)
//            ));
    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product());

    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }


    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}




