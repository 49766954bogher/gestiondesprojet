package com.ibrahima.gestiondesprojet.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private Status status;
    @Column(name = "create_date")
    private Date createAt;
    @Column(name = "update_date")
    private Date updateAt;
    @Column(name = "due_date")
    private Date dueAt;

    @ManyToOne(fetch = FetchType.LAZY)
    private  Sprint sprint;
    @ManyToMany( fetch=FetchType.EAGER)
    private Collection<Member>  member =new ArrayList<>();


}
