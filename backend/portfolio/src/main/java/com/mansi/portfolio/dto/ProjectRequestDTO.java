package com.mansi.portfolio.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProjectRequestDTO {

    @NotBlank(message = "Title should not be empty")
    private String title;

    @NotBlank(message = "Description cannot be empty")
    @Size(min = 50, max = 500)
    private String description;

    private String githubLink;
    private String imageUrl;
    private String liveDemo;
    private String technology;

    public ProjectRequestDTO() {

    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public String getGithubLink() {
      return githubLink;
    }

    public void setGithubLink(String githubLink) {
      this.githubLink = githubLink;
    }

    public String getImageUrl() {
      return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
    }

    public String getLiveDemo() {
      return liveDemo;
    }

    public void setLiveDemo(String liveDemo) {
      this.liveDemo = liveDemo;
    }

    public String getTechnology() {
      return technology;
    }

    public void setTechnology(String technology) {
      this.technology = technology;
    }
    

}
