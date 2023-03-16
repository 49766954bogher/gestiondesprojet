package com.ibrahima.gestiondesprojet.security.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Role {
      @Id
      private String roleName;
      private String roleDescription;
  


 
}
