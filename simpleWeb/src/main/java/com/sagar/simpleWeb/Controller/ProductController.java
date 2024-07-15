package com.sagar.simpleWeb.Controller;

import com.sagar.simpleWeb.Model.Product;
import com.sagar.simpleWeb.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
  @PostMapping("/product")
  public void addProduct(@RequestBody Product product){
    System.out.println(product);
    service.addProduct(product);


  }

@PutMapping("/product")
    public void updateProduct(@RequestBody Product product){
    System.out.println(product);
    service.updateProduct(product);
}
    @DeleteMapping("/product/{id}")
public  void deleteProduct(@PathVariable int id){
  service.deleteProduct(id);

}
}
