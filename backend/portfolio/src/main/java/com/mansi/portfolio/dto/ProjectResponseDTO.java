package com.mansi.portfolio.dto;

public class ProjectResponseDTO {
    private Long id;
    private String title;
    private String description;
    private String githubLink;

    private String imageUrl;

    private String liveDemo;

    private String technology;

    public ProjectResponseDTO() {
    }

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
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
