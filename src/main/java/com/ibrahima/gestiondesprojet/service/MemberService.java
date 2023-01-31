package com.ibrahima.gestiondesprojet.service;

import com.ibrahima.gestiondesprojet.entity.User;

public interface MemberService {
    User login(String username, String password);

    User getUserById(Integer id);

    void editUser(Integer id);

    void addMemberToproject(String membreName, String projectName);
    void affecttaskForMember(String membreName, String taskName);

}
