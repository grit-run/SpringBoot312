package com.elinsky.threeonetwo.service;

import com.elinsky.threeonetwo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(long id,User updUser);

    Optional<User> findOneUser(long id);

    void deleteUser(long id);
}
