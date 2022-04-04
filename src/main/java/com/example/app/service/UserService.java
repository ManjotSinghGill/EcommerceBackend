package com.example.app.service;

import com.example.app.dao.UserDao;
import com.example.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("UserDao") UserDao userDao){
        this.userDao = userDao;
    }

    public int addUser(User user){
        return userDao.insertUser(user);
    }

    public List<User> getAllUser(){
     return userDao.selectAllUser();
    }

    public Optional<User> getUserByID(UUID id) {return userDao.selectUserByID(id);}

    public int removeUserByID(UUID id) {return userDao.removeUser(id);}

    public int updateUserByID(UUID id, User user) {return userDao.updateUser(id, user);}
}
