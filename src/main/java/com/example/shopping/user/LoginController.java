package com.example.shopping.user;

import com.example.shopping.user.model.User;
import com.example.shopping.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody User user) {
        return new LoginResponse(loginService.login(user));
    }
}
