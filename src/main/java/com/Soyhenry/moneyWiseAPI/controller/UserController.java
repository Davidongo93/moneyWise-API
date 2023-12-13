package com.Soyhenry.moneyWiseAPI.controller;

import com.Soyhenry.moneyWiseAPI.model.User;
import com.Soyhenry.moneyWiseAPI.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/users")
public class UserController {
    private UserService userService;
    @PostMapping
    public User createUser(User user){
        return userService.createUser(user);
    }
@GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
@GetMapping("{id}")
    public User searchUserById(@PathVariable("id") String id){
        return  userService.getUserById(id);
    }

    @GetMapping("{id}")
    public void  deleteUserById(@PathVariable("id") String id){
         userService.deleteUser(id); // TODO hacer borrado logico(?)
    }
}
