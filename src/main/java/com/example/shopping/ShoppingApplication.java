package com.example.shopping;

import com.example.shopping.product.ProductRepository;
import com.example.shopping.product.model.Product;
import com.example.shopping.shoppingCart.model.ShoppingCart;
import com.example.shopping.shoppingCart.model.ShoppingCartRepository;
import com.example.shopping.user.UserRepository;
import com.example.shopping.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ShoppingApplication {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ShoppingCartRepository shoppingCartRepository;

	@PostConstruct
	public void initialData() {
		Product product1 = new Product("Testing","Testing",20.00);
		productRepository.save(product1);
		User user1 = new User("Testing","Passsword");
		userRepository.save(user1);
		ShoppingCart shoppingCart = new ShoppingCart(product1, 2, user1);
		shoppingCartRepository.save(shoppingCart);
	}

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}

}

