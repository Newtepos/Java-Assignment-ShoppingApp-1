package com.example.shopping.shoppingCart.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {
}
