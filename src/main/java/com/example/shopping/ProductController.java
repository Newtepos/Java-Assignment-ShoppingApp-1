package com.example.shopping;

import com.example.shopping.modal.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/{Id}")
    public Optional<Product> getProductById(@PathVariable int Id) {
        return productService.findProductById(Id);
    }
}
