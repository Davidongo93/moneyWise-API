package com.Soyhenry.moneyWiseAPI.controller;

import com.Soyhenry.moneyWiseAPI.model.User;
import com.Soyhenry.moneyWiseAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
@GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
@GetMapping("{id}")
    public User searchUserById(@PathVariable("id") Long id){
        return  userService.getUserById(id);
    }

    @DeleteMapping("{id}")
    public void  deleteUserById(@PathVariable("id") Long id){
         userService.deleteUser(id); // TODO hacer borrado logico(?)
    }
}
