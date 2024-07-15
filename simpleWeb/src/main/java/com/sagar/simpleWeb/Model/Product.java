package com.sagar.simpleWeb.Model;
import org.springframework.stereotype.Component;


//@AllArgsConstructor
@Component
public class Product {


    private int id;
    private String productName;
    private int Price;

    public Product() {

    }

    public Product(int id, String productName, int price) {
        this.id = id;
        this.productName = productName;
        Price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}



