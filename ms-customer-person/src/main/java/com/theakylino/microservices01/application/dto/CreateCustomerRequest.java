package com.theakylino.microservices01.application.dto;

import lombok.Data;

@Data
public class CreateCustomerRequest {

  private String identityCard;
  private String namePerson;
  private String gender;
  private String age;
  private String address;
  private String phoneNumber;
  private String clientId;
  private String password;
  private boolean status;
}
