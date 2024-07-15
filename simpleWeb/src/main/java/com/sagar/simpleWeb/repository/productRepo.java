package com.sagar.simpleWeb.repository;

import com.sagar.simpleWeb.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepo extends JpaRepository<Product,Integer> {

}
