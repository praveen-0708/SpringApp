package com.springproject.sample.service;

import com.springproject.sample.model.User;
import com.springproject.sample.repository.DBRepo;
import com.springproject.sample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "DB")
public class UserServiceDB implements UserRepository {
    @Autowired
    private DBRepo dbRepo;

    public void addUser(User user){
        dbRepo.save(user);
    }
    public List<User> getUsers(){
        return dbRepo.findAll();
    }
    public User getUserById(int userId){
        return dbRepo.findById(userId).get();
    }
    public void updateUserById(int userId,User user){
        user.setUserId(userId);
        dbRepo.save(user);
    }
    public void deleteUserById(int userId){
        dbRepo.deleteById(userId);
    }

}
