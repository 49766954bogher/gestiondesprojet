package com.ibrahima.gestiondesprojet.security.service;

import com.ibrahima.gestiondesprojet.security.dao.RoleDao;
import com.ibrahima.gestiondesprojet.security.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.ibrahima.gestiondesprojet.security.entity.User;
import com.ibrahima.gestiondesprojet.security.entity.Role;
import java.util.Set;




import java.util.HashSet;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;
    public User registerNewUSer(User user){
      Role role=  roleDao.findById("User").get();
      Set<Role> roles =new HashSet<>();
      roles.add(role);
      user.setRoles(roles);
      user.setUserPassword(passwordEncoder(user.getUserPassword()));
      return userDao.save(user);
    }
    public  void initialRole(){
        //=================== Admin Role ================================
        Role adminRole =new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin role");
        roleDao.save(adminRole);
        //=================== User Role ================================
        Role userRole =new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("User role for newly created record");
        roleDao.save(userRole);
        //========================== Admin ===============================
        User adminUser = new User();
        adminUser.setUserFirstname("admin");
        adminUser.setUserLastname("1997");
        adminUser.setUserName("admin1997");
        adminUser.setUserPassword(passwordEncoder("admin1997@pass"));
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRoles(adminRoles);
        userDao.save(adminUser);
        //==========================create new  User ===============================
//        User user = new User();
//        user.setFirstname("user");
//        user.setLastname("1997");
//        user.setUsername("user1997");
//        user.setPassword(passwordEncoder("user1997@pass"));
//        Set<Role> userRoles = new HashSet<>();
//        userRoles.add(userRole);
//        user.setRoles(userRoles);
//        userDao.save(user);

    }

    public String passwordEncoder(String password){
        return passwordEncoder.encode(password);
    }
}
