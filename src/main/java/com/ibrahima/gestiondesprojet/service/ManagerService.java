package com.ibrahima.gestiondesprojet.service;

import com.ibrahima.gestiondesprojet.entity.User;

import java.util.List;

public interface ManagerService {
    void createUser(User user);

    List<User> getUsers();

    User login(String username, String password);

    User getUserById(Integer id);

    void deleteUserById(Integer id);

    void editUser(Integer id);
}
