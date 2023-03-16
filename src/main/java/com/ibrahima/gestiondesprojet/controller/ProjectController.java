package com.ibrahima.gestiondesprojet.controller;
import com.ibrahima.gestiondesprojet.dao.ApiResponse;
import com.ibrahima.gestiondesprojet.entity.Project;
import com.ibrahima.gestiondesprojet.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("projects")
@CrossOrigin(origins = "*")

public class ProjectController {

    @Autowired
    private  ProjectService projectService;


    @GetMapping("/getProjects")
    public ApiResponse<List<Project>> getAllProjects(){
        List<Project> projects = projectService.getAllProjects();
        return new ApiResponse<>(projects.size(),projects);
    }

    @PutMapping("/addProject")
    public Project adddProject(Project project){
        return projectService.addProject(project);
    }

    @GetMapping("/{field}")
    public ApiResponse<List<Project>> getProjectWithSort(@PathVariable String field){
        List<Project> projects = projectService.getProjectWithSorting(field);
        return new ApiResponse<>(projects.size(),projects);
    }

    @DeleteMapping("/deleteProjectById/{id}")
    public void deleteProject(Long id){
        projectService.deleteProject(id);
    }
    @GetMapping("/{offset}/{pageSize}")
    public ApiResponse<Page<Project>> getProjectWithPagination(@PathVariable int offset,@PathVariable int pageSize){
        Page<Project> projects = projectService.getProjectWithPagination(offset, pageSize);
        return new ApiResponse<>(projects.getSize(),projects);
    }

        @RequestMapping("/search")
        public String searchProject(Model model , @Param("keyword") String keyword) {
        List<Project> projects =  projectService.findProject(keyword);
        model.addAttribute("projects", projects);
        model.addAttribute("keyword", keyword);
        return "projects";

        }



}
