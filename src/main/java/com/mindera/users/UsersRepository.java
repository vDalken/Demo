package com.mindera.users;

import java.util.List;

public interface UsersRepository {
    void createUser(User user);
    User getUser(Integer id);
    List<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(User user);
}
