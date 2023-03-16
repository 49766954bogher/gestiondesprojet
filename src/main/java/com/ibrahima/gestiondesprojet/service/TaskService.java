package com.ibrahima.gestiondesprojet.service;

import com.ibrahima.gestiondesprojet.entity.Task;
import com.ibrahima.gestiondesprojet.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task) {
        return taskRepository.save(task);


    }


    public void deleteTask(Long id) {
        taskRepository.deleteById(id);

    }

    public void editTask(Long id) {

    }

    public Iterable<Task> findAllTasks() {
        return taskRepository.findAll();


    }

    String showTaskStatus(Task task) {
        return "";
    }

}
