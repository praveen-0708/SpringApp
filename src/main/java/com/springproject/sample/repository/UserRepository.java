package com.springproject.sample.repository;

import com.springproject.sample.model.User;

import java.util.List;

public interface UserRepository {
    void addUser(User user);
    List<User> getUsers();
    User getUserById(int userId);
    void updateUserById(int userId,User user);
    void deleteUserById(int userId);
}
