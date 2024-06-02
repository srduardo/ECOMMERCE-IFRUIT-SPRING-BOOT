package com.ifruitcommerce.ifruit.repositories;

import com.ifruitcommerce.ifruit.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long>{
    @Query("SELECT p FROM Product p WHERE p.name = ?1")
    Product findProductByName(String name);
}
