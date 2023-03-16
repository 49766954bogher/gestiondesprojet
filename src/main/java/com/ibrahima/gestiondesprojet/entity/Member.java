package com.ibrahima.gestiondesprojet.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.Collection;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "member_id")
    private Long id;

    @ManyToMany(mappedBy = "member", fetch = FetchType.EAGER)
    private Collection<Project> projects  =new ArrayList<>();
    @ManyToMany(mappedBy = "member", fetch = FetchType.EAGER)
    private Collection<Task> tasks =new ArrayList<>();


}
