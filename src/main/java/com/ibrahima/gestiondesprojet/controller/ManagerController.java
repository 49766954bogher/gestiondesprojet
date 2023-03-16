package com.ibrahima.gestiondesprojet.controller;


import com.ibrahima.gestiondesprojet.dao.ManagerDao;
import com.ibrahima.gestiondesprojet.entity.Manager;
import com.ibrahima.gestiondesprojet.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("managers")
@CrossOrigin(origins = "*")
public class ManagerController {
    @Autowired
    private final ManagerService managerService;
    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @GetMapping("/getAllManagers")
    public List<Manager> getManagers() {
        return managerService.getAllManagers();
    }

    @PostMapping("/addManager")
    public void add(@RequestBody ManagerDao managerDao) {
        managerService.add(managerDao);
    }

    @PutMapping("updateManager/{id}")
    public void update(@RequestBody ManagerDao managerDao, @PathVariable("id") Long id) {
        managerService.update(managerDao, id);
    }

    @DeleteMapping("/deleteManagerById/{id}")
    public void delete(@PathVariable("id") Long id) {
        managerService.delete(id);
    }


}
