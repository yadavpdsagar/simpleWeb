package com.sagar.simpleWeb.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;


//@AllArgsConstructor
@Component
@Entity
public class Product {
    @Id
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", Price=" + Price +
                '}';
    }
}



