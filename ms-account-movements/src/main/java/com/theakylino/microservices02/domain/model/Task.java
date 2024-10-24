package com.theakylino.microservices02.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {

  private int id;
  private String title;
  private String description;
  private boolean completed;
}
