package com.ibrahima.gestiondesprojet.service;

import com.ibrahima.gestiondesprojet.entity.Project;

import java.util.Date;

public interface ProjectService {
    Iterable<Project> getAllProject();

    Project createProject(Project project ) ;

    void editProjectById(Integer id);


    void deleteProjectById(Integer id);

    void deleteProjet(Project project);
    Date getDateByProject(String projectName);
    String getStatusForProject(String projectName);
}
