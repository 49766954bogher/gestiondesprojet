package com.ibrahima.gestiondesprojet.dao;


import com.ibrahima.gestiondesprojet.entity.*;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Builder
@Data
public class ProjectDao {
    private Long id;
    private String title;
    private String description;
    private Status statusEnum;
    private Date createAt;
    private Date updateAt;
    private Date dueAt;
    private Manager manager;
    private Collection<Member> member = new ArrayList<>();
    private Sprint sprint;


    public static ProjectDao fromEntity(Project project) {
        if (project == null) {
            return null;
        } else {
            return ProjectDao.builder()
                    .id(project.getId())
                    .title(project.getTitle())
                    .description(project.getDescription())
                    .statusEnum(project.getStatusEnum())
                    .createAt(project.getCreateAt())
                    .updateAt(project.getUpdateAt())
                    .dueAt(project.getDueAt())
                    .sprint((Sprint) project.getSprints())
                    .manager(project.getManager())
                    .member(project.getMember())
                    .build();


        }
    }

    public static Project toEntity(ProjectDao projectDao) {
        if (projectDao == null) {
            return null;
        } else {
            Project project1 = new Project();
            project1.setId(project1.getId());
            project1.setTitle(projectDao.getTitle());
            project1.setDescription(projectDao.getDescription());
            project1.setStatusEnum(projectDao.getStatusEnum());
            project1.setCreateAt(project1.getCreateAt());
            project1.setDueAt(projectDao.getDueAt());
            project1.setUpdateAt(projectDao.getUpdateAt());
            project1.setSprints((Collection<Sprint>) projectDao.getSprint());
            project1.setMember(projectDao.getMember());
            project1.setManager(projectDao.getManager());
            return project1;


        }


    }

}
