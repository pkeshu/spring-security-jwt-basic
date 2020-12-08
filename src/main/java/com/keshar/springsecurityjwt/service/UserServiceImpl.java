package com.keshar.springsecurityjwt.service;

import com.keshar.springsecurityjwt.entity.Users;
import com.keshar.springsecurityjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServices {
    @Autowired
    private UserRepository repository;

    @Override
    public List<Users> saveAll(List<Users> users) {
        return repository.saveAll(users);
    }

    @Override
    public Users findByUsername(String username) {
        return repository.findByUsername(username);
    }
}
