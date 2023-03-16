package com.ibrahima.gestiondesprojet.security.dao;

import com.ibrahima.gestiondesprojet.security.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao  extends CrudRepository<User,String>{}

