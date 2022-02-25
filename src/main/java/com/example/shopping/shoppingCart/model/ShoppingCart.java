package com.example.shopping.shoppingCart.model;

import com.example.shopping.product.model.Product;
import com.example.shopping.user.model.User;

import javax.persistence.*;
import java.util.List;

@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Double totalPrice;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getTotalPrice() {
        Double sum = 0.0;
        sum = sum + (product.getPrice() * quantity);
        return sum;
    }

    public ShoppingCart(Product product, int quantity, User user) {
        this.product = product;
        this.quantity = quantity;
        this.user = user;
        this.totalPrice = getTotalPrice();
    }

    public ShoppingCart() {
    }
}
