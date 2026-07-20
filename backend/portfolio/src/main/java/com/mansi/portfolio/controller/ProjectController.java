package com.mansi.portfolio.controller;

import com.mansi.portfolio.entity.Project;
import com.mansi.portfolio.service.ProjectService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import jakarta.validation.Valid;
import com.mansi.portfolio.dto.ProjectRequestDTO;
import com.mansi.portfolio.dto.ProjectResponseDTO;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "http://localhost:5173")  
@RestController
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ProjectResponseDTO> addProject(@Valid @RequestBody ProjectRequestDTO  projectRequestDTO) {
      ProjectResponseDTO  response = service.addProject(projectRequestDTO);
      return ResponseEntity
                     .status(HttpStatus.CREATED)
                     .body(response);
    }

    @GetMapping
    public ResponseEntity<List<ProjectResponseDTO>> getAllProjects() {
        List<ProjectResponseDTO> projects = service.getAllProjects();
        return ResponseEntity.ok(projects);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProjectResponseDTO> getProjectById(@PathVariable Long id) {
        ProjectResponseDTO project = service.getProjectById(id);
        return ResponseEntity.ok(project);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProjectResponseDTO> updateProject(@PathVariable Long id,
        @Valid @RequestBody ProjectRequestDTO projectRequestDTO) {
        ProjectResponseDTO existingProject = service.updateProject(id, projectRequestDTO);
        return ResponseEntity.ok(existingProject);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
        
        service.deleteProject(id);

        return ResponseEntity.noContent().build();
    }
}
