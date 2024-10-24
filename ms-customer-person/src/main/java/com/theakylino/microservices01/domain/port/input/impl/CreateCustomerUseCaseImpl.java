package com.theakylino.microservices01.domain.port.input.impl;

import com.theakylino.microservices01.application.dto.CreateCustomerRequest;
import com.theakylino.microservices01.domain.port.input.CreateCustomerUseCase;
import com.theakylino.microservices01.domain.port.output.CreateCustomerRepositoryPort;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateCustomerUseCaseImpl implements CreateCustomerUseCase {

  @Autowired
  private CreateCustomerRepositoryPort repositoryPort;

  @Override
  public Optional<CreateCustomerRequest> addCustomer(final CreateCustomerRequest request) {
    return repositoryPort.save(request);
  }
}
