package com.ibrahima.gestiondesprojet.repository;

import com.ibrahima.gestiondesprojet.entity.Member;
import com.ibrahima.gestiondesprojet.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Member, Long> {


}
