package com.elinsky.threeonetwo.controller;

import com.elinsky.threeonetwo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UsersController {
    @GetMapping
    public List<User> getUsers(){
        return List.of(
                new User(
                        1L,
                        "John",
                        "John@gmail.com",
                        21
                )
        );
    }
}
