package com.elinsky.threeonetwo.service;

import com.elinsky.threeonetwo.model.User;
import com.elinsky.threeonetwo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
     }

    @Override
    public User readUser(long id) {
        return null;
    }

    @Override
    public User deleteUser(long id) {
        return null;
    }
}
