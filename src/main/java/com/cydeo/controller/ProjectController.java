package com.cydeo.controller;

import com.cydeo.entity.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/project")
public class ProjectController {

    private final ProjectController projectController;

    public ProjectController(ProjectController projectController) {
        this.projectController = projectController;
    }


    public ResponseEntity<ResponseWrapper> getProjects(){

    }

    public ResponseEntity<ResponseWrapper> getProjectByCode(){

    }

    public ResponseEntity<ResponseWrapper> createProject(){

    }

    public ResponseEntity<ResponseWrapper> updateProjects(){

    }

    public ResponseEntity<ResponseWrapper> deleteProjects(){

    }

    public ResponseEntity<ResponseWrapper> getProjectByManager(){

    }

    public ResponseEntity<ResponseWrapper> managerCompleteProject(){

    }


}
