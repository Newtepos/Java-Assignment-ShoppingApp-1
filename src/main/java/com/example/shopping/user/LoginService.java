package com.example.shopping.user;

import com.example.shopping.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {


    @Autowired
    private UserRepository userRepository;

    public LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String login(User user) {

        Optional<User> result = userRepository.findByUsername(user.getUsername());
        if(result.isPresent())
        {
            if(user.getPassword().equals(result.get().getPassword()))
            {
                return "Logged";
            }
            return "Password is Incorrect";
        }
        return "User not Found";
    }
}
