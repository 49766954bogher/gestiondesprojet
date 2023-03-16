package com.ibrahima.gestiondesprojet.security.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;
@Data
@Entity
public class User {

  @Id
  private String userName;

  private String userFirstname;
  private String userLastname;
  private String userPassword;
  @ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
  @JoinTable(name="User_Roles", joinColumns={
    @JoinColumn (name="USER_ID"),


  },
  inverseJoinColumns={
    @JoinColumn(name="ROLE_ID")
  }
  )
  private Set<Role> roles;

}
