package com.ibrahima.gestiondesprojet.security.controller;

import com.ibrahima.gestiondesprojet.security.entity.User;
import com.ibrahima.gestiondesprojet.security.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")


public class UserController {
    @Autowired

    private UserService userService;


    @PostMapping("/createNewUser")

    public User registerNewUser(@RequestBody User user) {
        return userService.registerNewUSer(user);

    }

    @PostConstruct

    public void initialRoleAndUsers() {
        userService.initialRole();

    }

    @GetMapping("/forAdmin")
    @PreAuthorize("hasRole('Admin')")

    public String forAdmin() {
        return "this URL is only accessible for admin";
    }

    @GetMapping("/forUser")
    @PreAuthorize("hasRole('User')")

    public String forUser() {
        return "this URL is only accessible for users";
    }

}
