package com.ibrahima.gestiondesprojet.dao;

import com.ibrahima.gestiondesprojet.entity.*;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Data
@Builder
public class SprintDao {
    private Long id;
    private String title;
    private String description;
    private Status statusEnum;
    private Date createAt;
    private Date updateAt;
    private Date dueAt;

    private Project project;

    private Collection<Task> tasks = new ArrayList<>();

    public static SprintDao fromEntity(Sprint sprint) {
        if (sprint == null) {
            return null;
        } else {
            return SprintDao.builder()
                    .id(sprint.getId())
                    .title(sprint.getTitle())
                    .description(sprint.getDescription())
                    .statusEnum(sprint.getStatusEnum())
                    .createAt(sprint.getCreateAt())
                    .updateAt(sprint.getUpdateAt())
                    .dueAt(sprint.getDueAt())
                    .project(sprint.getPoject())
                    .tasks(sprint.getTasks())
                    .build();


        }
    }

    public static Sprint toEntity(SprintDao sprintDao) {
        if (sprintDao == null) {
            return null;
        } else {
            Sprint sprint = new Sprint();
            sprint.setId(sprint.getId());
            sprint.setTitle(sprintDao.getTitle());
            sprint.setDescription(sprintDao.getDescription());
            sprint.setStatusEnum(sprintDao.getStatusEnum());
            sprint.setCreateAt(sprint.getCreateAt());
            sprint.setDueAt(sprintDao.getDueAt());
            sprint.setUpdateAt(sprintDao.getUpdateAt());
            sprint.setPoject(sprintDao.getProject());
            sprint.setTasks(sprintDao.getTasks());
            return sprint;


        }


    }


}
