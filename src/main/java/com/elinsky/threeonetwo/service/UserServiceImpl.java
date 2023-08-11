package com.elinsky.threeonetwo.service;

import com.elinsky.threeonetwo.model.User;
import com.elinsky.threeonetwo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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
    @Transactional
    public void createUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(long id, User updUser) {
        updUser.setId(updUser.getId());
        userRepository.save(updUser);
     }

    @Override
    @Transactional
    public Optional<User> findOneUser(long id) {
        return userRepository.findById(id);
       }

    @Override
    @Transactional
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}