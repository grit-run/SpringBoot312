package com.elinsky.threeonetwo.service;

import com.elinsky.threeonetwo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(User user);

    User readUser(long id);

    User deleteUser(long id);
}
