package com.example.crud.resources;

import com.example.crud.models.User;
import com.example.crud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/find")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping
    public List<User> getUserById(@RequestParam(name="id") String userId){
        return userService.getUserById(userId);
    }

    @PutMapping
    public void updateUser(@RequestBody User user){
        userService.updateUSer(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name="id") String userId){
        userService.deleteUSer(userId);
    }

}
