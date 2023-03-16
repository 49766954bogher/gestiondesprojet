package com.ibrahima.gestiondesprojet.security.controller;

import com.ibrahima.gestiondesprojet.security.entity.Role;
import com.ibrahima.gestiondesprojet.security.service.RoleService;
import com.ibrahima.gestiondesprojet.security.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")


public class RoleController{
    @Autowired
    private RoleService roleService;
    @PostMapping({"/createRole"})
    public Role createRole(@RequestBody Role createRole){
        return roleService.createNewRole(createRole);

    }

}
