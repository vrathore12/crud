package com.example.crud.services;

import com.example.crud.models.User;
import com.example.crud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    public List<User> getUserById(String userId) {
        return userRepository.findAllById(userId);
    }


    public void updateUSer(User user) {
        userRepository.save(user);
    }


    public void deleteUSer(String userId) {
        userRepository.deleteById(userId);
    }

    public List<User> getUserByName(String name) {
        return userRepository.findAllByName(name);
    }
}

