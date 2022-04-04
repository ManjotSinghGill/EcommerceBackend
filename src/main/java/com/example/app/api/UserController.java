package com.example.app.api;

import com.example.app.model.User;
import com.example.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/controller/user")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }

    @GetMapping(path = "{id}")
    public User getUserByID(@PathVariable("id") UUID id) {return userService.getUserByID(id).orElse(null);}

    @DeleteMapping(path = "{id}")
    public void removeUserByID(@PathVariable("id") UUID id){ userService.removeUserByID(id);}

    @PutMapping(path = "{id}")
    public void updateUserByID(@PathVariable("id") UUID id, @RequestBody User user){
        userService.updateUserByID(id, user);
    }
}
