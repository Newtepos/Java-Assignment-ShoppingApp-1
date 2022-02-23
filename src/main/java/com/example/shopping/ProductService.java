package com.example.shopping;

import com.example.shopping.modal.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Optional<Product> findProductById(int Id) {
        Optional<Product> result = productRepository.findById(Id);
        return result;
    }
}
