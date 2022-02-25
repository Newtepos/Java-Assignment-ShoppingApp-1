package com.example.shopping.product;

import com.example.shopping.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Override
    Optional<Product> findById(Integer integer);

    List<Product> findByProductDescriptionContainsIgnoreCaseOrProductNameContainsIgnoreCase(String productName, String productDescription);
}
