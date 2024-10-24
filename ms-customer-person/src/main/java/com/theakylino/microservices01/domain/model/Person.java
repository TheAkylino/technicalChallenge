package com.theakylino.microservices01.domain.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Person {

  private String identityCard;
  private String namePerson;
  private String gender;
  private String age;
  private String address;
  private String phoneNumber;
}
