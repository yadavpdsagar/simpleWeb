package com.sagar.simpleWeb.Controller;

import com.sagar.simpleWeb.Model.Product;
import com.sagar.simpleWeb.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service;
@RequestMapping("/product")
    public List<Product> getProducts(){

        return service.getProducts();
    }
    @RequestMapping("/product/{id}")
  public  Product getProductById(@PathVariable int id){
    return service.getProductById(id);
  }
}
