package com.ibrahima.gestiondesprojet.service;

import com.ibrahima.gestiondesprojet.entity.Member;
import com.ibrahima.gestiondesprojet.security.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
    User login(String username, String password);

    User getUserById(Long id);

    void editUser(Long id);

    void addMemberToproject(String membreName, String projectName);
    void affectTaskForMember(String membreName, String taskName);

    Member createMember(Member member);

    Iterable<Member> getAllMembers();

    void deleteMember(Long id);
}
