package com.example.shopping;

import com.example.shopping.modal.product.Product;
import com.example.shopping.modal.user.User;
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

	@PostConstruct
	public void initUserData() {
		User user = new User("supakit","1234");
		userRepository.save(user);

		Product product1 = new Product("Product1 Name", "Product description");
		productRepository.save(product1);
	}

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}

}

