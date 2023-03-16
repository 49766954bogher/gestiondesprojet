package com.ibrahima.gestiondesprojet.repository;

import com.ibrahima.gestiondesprojet.entity.Member;
import com.ibrahima.gestiondesprojet.entity.Project;
import com.ibrahima.gestiondesprojet.entity.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SprintRepository extends JpaRepository<Member, Long> {

}
