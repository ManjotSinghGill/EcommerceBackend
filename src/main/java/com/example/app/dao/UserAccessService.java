package com.example.app.dao;

import com.example.app.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("UserDao")
public class UserAccessService implements UserDao {

    private static List<User> DB = new ArrayList<>();

    @Override
    public int insertUser(UUID id, User user) {
        DB.add(new User(id, user.getEmail(), user.getName(), user.getPassword(), user.getPhone()));
        return 1;
    }

    @Override
    public int removeUser(UUID id) {
        Optional<User> userToDelete = selectUserByID(id);
        if(userToDelete.isEmpty()){
            return 0;
        }
        DB.remove(userToDelete.get());
        return 1;
    }

    @Override
    public int updateUser(UUID id, User user) {
        return selectUserByID(id)
                .map(p -> {
                    int indexOfUserToUpdate = DB.indexOf(p);
                    if(indexOfUserToUpdate >=0){
                        DB.set(indexOfUserToUpdate, new User(id, user.getEmail(), user.getName(), user.getPassword(), user.getPhone()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }


    @Override
    public Optional<User> selectUserByID(UUID id) {
        return DB.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<User> selectAllUser() {
        return DB;
    }

    @Override
    public Optional<User> selectUserByEmail(String email) {
        return DB.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }


}
