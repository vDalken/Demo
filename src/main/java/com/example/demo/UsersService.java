package com.example.demo;

import java.util.LinkedList;
import java.util.List;

public class UsersService implements UsersRepository {
    private List<User> users;

    public UsersService(List<User> users) {
        this.users = users;
    }

    public UsersService() {
        users = new LinkedList<>();
    }

    @Override
    public void createUser(User user) {
        users.add(user);
    }

    @Override
    public User getUser(Integer id) {
        return users
                .stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User updateUser(User user) {
        return users
                .stream()
                .filter(userList -> userList.getId().equals(user.getId()))
                .map(userList -> user)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void deleteUser(User user) {
        users = users
                .stream()
                .filter(userList -> userList.getId()!=user.getId()).toList();
    }
}
