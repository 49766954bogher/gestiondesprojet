package com.ibrahima.gestiondesprojet.repository;

import com.ibrahima.gestiondesprojet.entity.Member;
import com.ibrahima.gestiondesprojet.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {


}
