package com.example.demo;

import java.util.List;

public interface UsersRepository {
    void createUser(User user);
    User getUser(Integer id);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUser(User user);
}
