package com.ibrahima.gestiondesprojet.dao;

import com.ibrahima.gestiondesprojet.entity.Task;
import com.ibrahima.gestiondesprojet.entity.*;
import lombok.Builder;
import lombok.Data;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Builder
@Data
public class TaskDao {
    private Long id;
    private String title;
    private String description;
    private Status status;
    private Date createAt;
    private Date updateAt;
    private Date dueAt;
    private  Sprint sprint;
    private Collection<Member>  member =new ArrayList<>();

    public static TaskDao fromEntity(Task task) {
        if (task == null) {
            return null;
        } else {
            return TaskDao.builder()
                    .id(task.getId())
                    .title(task.getTitle())
                    .description(task.getDescription())
                    .createAt(task.getCreateAt())
                    .updateAt(task.getUpdateAt())
                    .dueAt(task.getDueAt())
                    .sprint(task.getSprint())
                    .member(task.getMember())
                    .build();


        }
    }

    public static Task toEntity(TaskDao taskDao) {
        if (taskDao == null) {
            return null;
        } else {
            Task task = new Task();
            task.setId(task.getId());
            task.setTitle(taskDao.getTitle());
            task.setDescription(taskDao.getDescription());
            task.setCreateAt(task.getCreateAt());
            task.setDueAt(taskDao.getDueAt());
            task.setStatus(taskDao.getStatus());
            task.setUpdateAt(taskDao.getUpdateAt());
            task.setSprint(taskDao.getSprint());
            task.setMember(taskDao.getMember());
            return task;


        }


    }

}

