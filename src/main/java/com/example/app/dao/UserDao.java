package com.example.app.dao;

import com.example.app.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {

    int insertUser(UUID id, User user);

    default int insertUser(User user){
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }

    int removeUser(UUID id);

    int updateUser(UUID id, User user);

    Optional<User> selectUserByID(UUID id);

    List<User> selectAllUser();

    Optional<User> selectUserByEmail(String email);
}
