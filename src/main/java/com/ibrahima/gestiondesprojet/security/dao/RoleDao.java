package com.ibrahima.gestiondesprojet.security.dao;

import com.ibrahima.gestiondesprojet.security.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao  extends CrudRepository<Role,String> {}
