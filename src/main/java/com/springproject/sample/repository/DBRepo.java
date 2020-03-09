package com.springproject.sample.repository;

import com.springproject.sample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBRepo extends JpaRepository<User,Integer> {
    User findByName(String name);
}
