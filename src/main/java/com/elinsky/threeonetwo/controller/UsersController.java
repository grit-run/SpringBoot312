package com.elinsky.threeonetwo.controller;

import com.elinsky.threeonetwo.model.User;
import com.elinsky.threeonetwo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@Controller
public class UsersController {
    public final UserServiceImpl userServiceImpl;

    @Autowired
    public UsersController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping("/users")
    public String allUsers(Model model) {
        model.addAttribute("users", userServiceImpl.getAllUsers());
        return "users-roster";
    }
    @GetMapping("/new-user")
    public String createUserForm(User user) {
        return "new-user";
    }
    @PostMapping("/new-user")
    public String createUser(User user) {
        userServiceImpl.createUser(user);
        return "redirect:/users";
    }
    @GetMapping("delete-user/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        userServiceImpl.deleteUser(id);
        return "redirect:/users";
    }

    @GetMapping("/update-user/{id}")
    public String updateUserForm(@PathVariable("id") Long id, Model model){
        Optional<User> user = userServiceImpl.findOneUser(id);
        model.addAttribute("user", user);
        return "update-user";
    }

    @PostMapping("/update-user")
    public String updateUser(long id, User updUser){
        userServiceImpl.updateUser(id, updUser);
        return "redirect:/users";
    }
}
