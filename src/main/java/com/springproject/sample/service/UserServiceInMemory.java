package com.springproject.sample.service;

import com.springproject.sample.model.User;
import com.springproject.sample.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "InMemory")
public class UserServiceInMemory implements UserRepository {
    private int userId=1;
    private List<User> userList=new ArrayList<>();

    public void addUser(User user){
        user.setUserId(userId);
        userList.add(user);
        userId++;
    }

    public List<User> getUsers(){
        return userList;
    }
    public User getUserById(int userId){
        for(User user:userList)
            if(user.getUserId()==userId)
                return user;
        return null;
    }
    public void updateUserById(int userId,User user){
        for(User userVariable:userList){
            if(userVariable.getUserId()==userId){
                userVariable.setName(user.getName());
                userVariable.setEmail(user.getEmail());
            }
        }
    }

    public void deleteUserById(int userId){
        for(User userVariable:userList)
            if(userVariable.getUserId()==userId)
                userList.remove(userVariable);
    }

}
