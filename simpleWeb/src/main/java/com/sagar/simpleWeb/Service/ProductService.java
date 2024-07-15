package com.sagar.simpleWeb.Service;

import com.sagar.simpleWeb.Model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product> products = Arrays.asList(
            new Product(101,"iphone",500),
            new Product(1,"sagar",202));
    public List<Product> getProducts() {
        return products;
    }
    
}
