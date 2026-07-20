package com.mansi.portfolio.service;

import org.springframework.stereotype.Service;

import com.mansi.portfolio.dto.ProjectRequestDTO;
import com.mansi.portfolio.dto.ProjectResponseDTO;
import com.mansi.portfolio.entity.Project;
import com.mansi.portfolio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import java.lang.RuntimeException;
import com.mansi.portfolio.exception.ProjectNotFoundException;

@Service
public class ProjectService {
    private final ProjectRepository repository;
    
    @Autowired
    public ProjectService(ProjectRepository repository) {
      this.repository = repository;
    }

    public ProjectResponseDTO addProject(ProjectRequestDTO  projectRequestDTO) {
      Project project = new Project();

      project.setTitle(projectRequestDTO.getTitle());

      project.setDescription(projectRequestDTO.getDescription());

      project.setGithubLink(projectRequestDTO.getGithubLink());

      project.setImageUrl(projectRequestDTO.getImageUrl());

      project.setLiveDemo(projectRequestDTO.getLiveDemo());

      project.setTechnology(projectRequestDTO.getTechnology());

      Project savedProject = repository.save(project);

      ProjectResponseDTO response = new ProjectResponseDTO();
      response.setId(savedProject.getId());
      response.setTitle(savedProject.getTitle());
      response.setDescription(savedProject.getDescription());
      response.setGithubLink(savedProject.getGithubLink());
      response.setImageUrl(savedProject.getImageUrl());
      response.setLiveDemo(savedProject.getLiveDemo());
      response.setTechnology(savedProject.getTechnology());

     return response;
    }

    public List<ProjectResponseDTO> getAllProjects() {
      List<Project> projects = repository.findAll();
      List<ProjectResponseDTO> response = new ArrayList<>();
      for(Project project : projects) {
          ProjectResponseDTO dto = new ProjectResponseDTO();
          dto.setId(project.getId());
          dto.setTitle(project.getTitle());
          dto.setDescription(project.getDescription());
          dto.setGithubLink(project.getGithubLink());
          dto.setImageUrl(project.getImageUrl());
          dto.setLiveDemo(project.getLiveDemo());
          dto.setTechnology(project.getTechnology());
          response.add(dto);
      }

      return response;
    }


    public ProjectResponseDTO getProjectById(Long id) {
      Project project = repository.findById(id).orElseThrow(() -> new RuntimeException("Project Not found"));
      ProjectResponseDTO response = new ProjectResponseDTO();

      response.setId(project.getId());
      response.setTitle(project.getTitle());
      response.setDescription(project.getDescription());
      response.setGithubLink(project.getGithubLink());
      response.setImageUrl(project.getImageUrl());
      response.setLiveDemo(project.getLiveDemo());
      response.setTechnology(project.getTechnology());

      return response;
    }

    public ProjectResponseDTO updateProject(Long id, ProjectRequestDTO projectRequestDTO) {
      Project existingProject = repository.findById(id).orElseThrow(() -> new ProjectNotFoundException("Not Found"));

      existingProject.setTitle(projectRequestDTO.getTitle());

      existingProject.setDescription(projectRequestDTO.getDescription());

      existingProject.setGithubLink(projectRequestDTO.getGithubLink());

      existingProject.setImageUrl(projectRequestDTO.getImageUrl());

      existingProject.setLiveDemo(projectRequestDTO.getLiveDemo());

      existingProject.setTechnology(projectRequestDTO.getTechnology());

      Project updatedProject = repository.save(existingProject);

      ProjectResponseDTO response = new ProjectResponseDTO();
      response.setId(updatedProject.getId());
      response.setTitle(updatedProject.getTitle());
      response.setDescription(updatedProject.getDescription());
      response.setGithubLink(updatedProject.getGithubLink());
      response.setImageUrl(updatedProject.getImageUrl());
      response.setLiveDemo(updatedProject.getLiveDemo());
      response.setTechnology(updatedProject.getTechnology());

      return response;
    }

    public void deleteProject(Long id) {
      Project existingProject = repository.findById(id).orElseThrow(() -> new RuntimeException("Project Not Found"));

      repository.delete(existingProject);
    }
    
}
