package com.example.shopping;

import com.example.shopping.modal.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ShoppingApplication {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initUserData() {
		User user = new User("supakit","1234");
		userRepository.save(user);
	}

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}

}

