package com.ibrahima.gestiondesprojet.service;

import com.ibrahima.gestiondesprojet.entity.Project;
import com.ibrahima.gestiondesprojet.entity.Sprint;
import com.ibrahima.gestiondesprojet.entity.Task;

import java.util.Date;

public interface SprintService {
    Iterable<Sprint> getAllProject();

    Project createSprint(Sprint sprint ) ;

    void editSprintById(Integer id);


    void deleteSprintById(Integer id);

    void deletSprint(Sprint sprint);
    String getStatusForSprint(String sprintName);
    Date getDateBySprint (Project project);
    Date getDateBySprint (Task task );


}
