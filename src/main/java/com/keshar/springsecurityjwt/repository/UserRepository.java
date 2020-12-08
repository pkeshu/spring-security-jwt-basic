package com.keshar.springsecurityjwt.repository;

import com.keshar.springsecurityjwt.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}
