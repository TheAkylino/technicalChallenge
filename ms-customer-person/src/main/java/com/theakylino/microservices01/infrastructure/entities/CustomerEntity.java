package com.theakylino.microservices01.infrastructure.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "Customer")
public class CustomerEntity extends PersonEntity {

  @Column(unique = true)
  private String clientId;
  private String password;
  private boolean status;
}
