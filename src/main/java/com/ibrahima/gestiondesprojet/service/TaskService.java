package com.ibrahima.gestiondesprojet.service;

import com.ibrahima.gestiondesprojet.entity.Task;

import java.util.Date;
import java.util.List;

public interface TaskService {
    void createTask(Task task);


    void deleteTask(Integer id);

    void editTask(Integer id);

    List<Task> findAll();

    String  showTaskStatus(Task task);
}
