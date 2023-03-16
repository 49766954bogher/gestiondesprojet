package com.ibrahima.gestiondesprojet.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "project_id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private Status statusEnum;

    @Column(name = "create_date")
    private Date createAt;
    @Column(name = "update_date")
    private Date updateAt;
    @Column(name = "due_date")
    private Date dueAt;
    @ManyToOne
    private  Manager manager;
    @ManyToMany(fetch=FetchType.EAGER)
    private Collection<Member>  member = new ArrayList<>();

    @OneToMany(mappedBy = "poject", fetch = FetchType.LAZY)
    private Collection<Sprint> sprints=new ArrayList<>();

}
