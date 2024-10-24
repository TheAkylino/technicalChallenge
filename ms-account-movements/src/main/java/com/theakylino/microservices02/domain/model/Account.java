package com.theakylino.microservices02.domain.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

  private String numberAccount;
  private String typeAccount;
  private BigDecimal initialBalance;
  private boolean state;
}
