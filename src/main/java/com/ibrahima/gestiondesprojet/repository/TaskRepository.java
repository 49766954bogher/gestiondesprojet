package com.ibrahima.gestiondesprojet.repository;

import com.ibrahima.gestiondesprojet.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository  extends JpaRepository<Task, Integer> {

}
