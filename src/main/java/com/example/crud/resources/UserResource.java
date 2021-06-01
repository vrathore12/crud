package com.example.crud.resources;

import com.example.crud.exceptions.CustomException;
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

    @GetMapping("/findByName")
    public List<User> getUserByName(@RequestParam(name="name")String name) throws CustomException {
        if(name.equalsIgnoreCase("root"))
            throw new CustomException();
        return userService.getUserByName(name);}

    @PutMapping
    public void updateUser(@RequestBody User user){
        userService.updateUSer(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name="id") String userId){
        userService.deleteUSer(userId);
    }


    @ExceptionHandler(CustomException.class)
    public String customException(CustomException ex){
        return ex.getMessage();
    }

}
