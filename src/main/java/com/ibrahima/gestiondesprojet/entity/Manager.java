package com.ibrahima.gestiondesprojet.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    private Collection<Project> projects;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
