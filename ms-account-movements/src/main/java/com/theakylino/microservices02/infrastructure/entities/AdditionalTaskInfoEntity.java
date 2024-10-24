package com.theakylino.microservices02.infrastructure.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AdditionalTaskInfoEntity {

  private Long userId;
  private String nameDeveloper;
  private String emailDeveloper;
}
