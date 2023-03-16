package com.ibrahima.gestiondesprojet.security.service;
import com.ibrahima.gestiondesprojet.security.dao.RoleDao;
import com.ibrahima.gestiondesprojet.security.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired

    private RoleDao roleDao;

    public Role createNewRole(Role role){
        return roleDao.save(role);

    }
    
}
