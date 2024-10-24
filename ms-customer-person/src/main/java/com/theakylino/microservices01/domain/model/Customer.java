package com.theakylino.microservices01.domain.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;


@Data
@SuperBuilder
public class Customer {

  private String clientId;
  private String password;
  private boolean status;
}
