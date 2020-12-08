package com.keshar.springsecurityjwt.service;

import com.keshar.springsecurityjwt.entity.Users;

import java.util.List;

public interface UserServices {
    List<Users> saveAll(List<Users> users);

    Users findByUsername(String username);
}
