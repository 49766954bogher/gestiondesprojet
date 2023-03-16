package com.ibrahima.gestiondesprojet.repository;

import com.ibrahima.gestiondesprojet.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {


}
