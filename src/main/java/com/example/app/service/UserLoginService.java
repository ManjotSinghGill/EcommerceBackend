package com.example.app.service;

import com.example.app.dao.UserDao;
import com.example.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserLoginService {

    private final UserDao userDao;

    @Autowired
    private UserLoginService(@Qualifier("UserDao") UserDao userDao){this.userDao = userDao;}

    public Optional<User> UserLogin(String email, String password){
        Optional<User> user = userDao.selectUserByEmail(email);
        if (Objects.equals(password, "12345678")) {
            return user;
        }
        return null;
    }
}
