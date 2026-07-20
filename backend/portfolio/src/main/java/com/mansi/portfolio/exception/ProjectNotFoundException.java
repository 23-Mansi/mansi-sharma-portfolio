package com.mansi.portfolio.exception;

public class ProjectNotFoundException extends RuntimeException{
  public ProjectNotFoundException(String message) {
    super(message);
  }

}
