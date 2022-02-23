package com.example.shopping.controller;

import com.example.shopping.service.ProductService;
import com.example.shopping.modal.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/{Id}")
    public Optional<Product> getProductById(@PathVariable int Id) {
        return productService.findProductById(Id);
    }

    @GetMapping("/product")
    public List<Product> getAllProductBySearch(@RequestParam(name = "p") String productName) {
        return productService.findAllProductByName(productName);
    }
}
