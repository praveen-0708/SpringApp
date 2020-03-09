package com.springproject.sample.controllers;

import com.springproject.sample.repository.DBRepo;
import com.springproject.sample.model.User;
import com.springproject.sample.repository.UserRepository;
import com.springproject.sample.service.UserServiceDB;
import com.springproject.sample.service.UserServiceInMemory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    @Qualifier("DB")
    private UserRepository userServiceDB;

    @PostMapping
    public String addUser(@RequestBody User user){
        userServiceDB.addUser(user);
        return "added user";
    }

    @GetMapping
    public List<User> getUsers(){
        logger.info("test");
        return userServiceDB.getUsers();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int userId){
        return userServiceDB.getUserById(userId);
    }
    @PutMapping("/{id}")
    public void updateUserById(@PathVariable("id") int userId,@RequestBody User user){
        userServiceDB.updateUserById(userId,user);
    }
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") int userId){
        userServiceDB.deleteUserById(userId);
    }

}
