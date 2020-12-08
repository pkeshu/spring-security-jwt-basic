package com.keshar.springsecurityjwt;

import com.keshar.springsecurityjwt.entity.Users;
import com.keshar.springsecurityjwt.repository.UserRepository;
import com.keshar.springsecurityjwt.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtApplication {

    @Autowired
    private UserServiceImpl userService;

    @PostConstruct
    public void initUsers() {
        List<Users> users = Stream.of(
                new Users(101, "keshar", "password", "keshar@gmail.com"),
                new Users(102, "user1", "pwd1", "user1@gmail.com"),
                new Users(103, "user2", "pwd2", "user2@gmail.com"),
                new Users(104, "user3", "pwd3", "user3@gmail.com")
        ).collect(Collectors.toList());
        userService.saveAll(users);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtApplication.class, args);
    }

}
