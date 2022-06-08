package com.example.app.api;

import com.example.app.model.LoginModel;
import com.example.app.model.User;
import com.example.app.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("api/controller/userlogin")
@RestController
public class UserLoginController {
    private final UserLoginService userLoginService;

    @Autowired
    public UserLoginController(UserLoginService userLoginService){this.userLoginService = userLoginService;}

    @PostMapping
    public Optional<User> UserLogin(@RequestBody LoginModel loginModel){
        return userLoginService.UserLogin(loginModel.getEmail(), loginModel.getPassword());
    }
}
