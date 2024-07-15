package com.sagar.simpleWeb.Service;

import com.sagar.simpleWeb.Model.Product;

import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service

public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"iphone",500),
            new Product(1,"sager",202),
            new Product(2,"samsung",20000),
            new Product(3,"mixami",20200)
            ));
    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream().filter(p->p.getId()==id)
                .findFirst().orElse(new Product(100,"no item",0));

    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index=0;
        for(int i=0; i<products.size(); i++){
            if(products.get(i).getId()==product.getId()){
                products.set(index,product);
            }
        }

    }


    public void deleteProduct(int id) {
      int index = 0;
      for(int i=0; i<products.size(); i++){
          if(products.get(i).getId()==id)
              index=i;}
              products.remove(index);
          }
      }



