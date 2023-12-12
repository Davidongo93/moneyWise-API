package com.Soyhenry.moneyWiseAPI.service;

import com.Soyhenry.moneyWiseAPI.model.User;
import com.Soyhenry.moneyWiseAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User createUser(User user){
      return userRepository.save(user);
    }
    public User getUserById(String id){
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.get();
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
public void deleteUser(String id){
        userRepository.deleteById(id);
}
}
