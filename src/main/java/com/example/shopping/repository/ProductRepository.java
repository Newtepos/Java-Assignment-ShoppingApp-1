package com.example.shopping.repository;

import com.example.shopping.modal.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Override
    Optional<Product> findById(Integer integer);

    List<Product> findByProductDescriptionContainsIgnoreCaseOrProductNameContainsIgnoreCase(String productName, String productDescription);
}
