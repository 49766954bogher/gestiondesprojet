package com.ibrahima.gestiondesprojet.dao;

import com.ibrahima.gestiondesprojet.entity.Manager;
import com.ibrahima.gestiondesprojet.entity.Project;
import lombok.*;

import java.util.Collection;


@Data
@Builder
public class ManagerDao {

    private Long id;
    private String name;

    private String email;

    private String jobTitle;
    private String imageUrl;


    private String password;
    private Collection<Project> projects;


    public static ManagerDao fromEntity(Manager manager) {
        if (manager == null) {
            return null;
        } else {
            return ManagerDao.builder()

                    .build();

        }
    }

    public static Manager toEntity(ManagerDao managerDao) {
        if (managerDao == null) {
            return null;
        } else {
            Manager manager = new Manager();
       
            return manager;


        }


    }

}
