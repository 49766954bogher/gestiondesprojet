package com.ibrahima.gestiondesprojet.controller;

import com.ibrahima.gestiondesprojet.entity.Task;
import com.ibrahima.gestiondesprojet.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("tasks")
@CrossOrigin(origins = "*")

public class TaskController {

    @Autowired
    private  TaskService taskService;

    @GetMapping("/getAll")
    public Iterable<Task> getTask() {
        return taskService.findAllTasks();
    }
    @DeleteMapping("/deleteTaskById/{id}")
    public void deleteTask( @PathVariable  final Long id){
        taskService.deleteTask(id);
    }
    @PutMapping("/addTask")
    public Task saveTask(@RequestBody  Task task) {
        Task savedTask= taskService.createTask(task);
        return savedTask;
    }


}
