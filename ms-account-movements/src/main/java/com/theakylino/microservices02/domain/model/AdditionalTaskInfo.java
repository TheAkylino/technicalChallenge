package com.theakylino.microservices02.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AdditionalTaskInfo {

  private Long userId;
  private String nameDeveloper;
  private String emailDeveloper;
}
