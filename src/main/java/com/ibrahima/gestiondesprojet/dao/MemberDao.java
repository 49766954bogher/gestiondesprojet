package com.ibrahima.gestiondesprojet.dao;
import com.ibrahima.gestiondesprojet.entity.*;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class MemberDao {
    private Long id;
    private String name;

    private String email;

    private String jobTitle;
    private String imageUrl;


    private String password;
    private Collection<Project> projects;
    private Collection<Task> tasks;

    public static MemberDao fromEntity(Member member) {
        if (member == null) {
            return null;
        } else {
            return MemberDao.builder().build();

        }
    }

    public static Member toEntity(MemberDao memberDao) {
        if (memberDao == null) {
            return null;
        } else {
            Member member = new Member();
            return member;


        }

    }
}
