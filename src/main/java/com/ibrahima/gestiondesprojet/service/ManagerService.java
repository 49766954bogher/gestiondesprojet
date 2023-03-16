package com.ibrahima.gestiondesprojet.service;

import com.ibrahima.gestiondesprojet.dao.ManagerDao;
import com.ibrahima.gestiondesprojet.entity.Manager;
import com.ibrahima.gestiondesprojet.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManagerService {

    @Autowired
    private  ManagerRepository managerRepository;
    public ManagerService(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;;
    }

    public List<Manager> getAllManagers() {
        return managerRepository.findAll();
    }




    public void update(ManagerDao managerDao, Long id) {
        Manager manager = managerRepository.findById(id).orElseThrow();
    }
    public void add(ManagerDao managerDao) {}

    public void delete(Long id) {
        managerRepository.deleteById(id);
    }

    public Optional<Manager> getManager(Long id){
        return managerRepository.findById(id);
    }


}
