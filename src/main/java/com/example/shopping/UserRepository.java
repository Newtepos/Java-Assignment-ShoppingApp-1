package com.example.shopping;

import com.example.shopping.modal.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Override
    List<User> findAll();

    Optional<User> findByUsername(String username);
}

