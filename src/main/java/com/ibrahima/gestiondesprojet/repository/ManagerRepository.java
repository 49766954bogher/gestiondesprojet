package com.ibrahima.gestiondesprojet.repository;

import com.ibrahima.gestiondesprojet.entity.Manager;
import com.ibrahima.gestiondesprojet.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ManagerRepository extends JpaRepository<Manager, Long> {



}
