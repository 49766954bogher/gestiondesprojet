package com.ibrahima.gestiondesprojet.service;

import com.ibrahima.gestiondesprojet.entity.Project;
import com.ibrahima.gestiondesprojet.repository.ProjectRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;


    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }


    public List<Project> getProjectWithSorting(String field) {
        return projectRepository.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    public Page<Project> getProjectWithPagination(int offset, int pageSize) {
        Page<Project> projectPage = projectRepository.findAll(PageRequest.of(offset, pageSize));
        return projectPage;
    }

    public Page<Project> getProjectWithPaginationAndSorting(int offset, int pageSize, String field) {
        Page<Project> projectPage = projectRepository.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(field)));
        return projectPage;
    }


    public List<Project> listAllProject(String keyword) {
        if (keyword != null) {
            return projectRepository.search(keyword);
        }
        return projectRepository.findAll();
    }

    public Project addProject(Project project) {
        return projectRepository.save(project);
    }

    public List<Project> findProject(String keyword) {
        if (keyword != null) {
            return projectRepository.search(keyword);

        }
        return (List<Project>) projectRepository.findAll();

    }


    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }


}
