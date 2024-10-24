package com.theakylino.microservices02.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movements {

  private String movementId;
  private LocalDate date;
  private String movementType;
  private BigDecimal value;
  private BigDecimal balance;
}
