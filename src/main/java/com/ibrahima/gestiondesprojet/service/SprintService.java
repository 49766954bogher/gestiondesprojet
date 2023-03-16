package com.ibrahima.gestiondesprojet.service;

import com.ibrahima.gestiondesprojet.entity.Project;
import com.ibrahima.gestiondesprojet.entity.Sprint;
import com.ibrahima.gestiondesprojet.entity.Task;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public interface SprintService {
    Iterable<Sprint> getAllProject();

    Project createSprint(Sprint sprint ) ;

    void editSprintById(Long id);


    void deleteSprintById(Long id);

    void deletSprint(Sprint sprint);
    String getStatusForSprint(String sprintName);
    Date getDateBySprint (Project project);
    Date getDateBySprint (Task task );


}
