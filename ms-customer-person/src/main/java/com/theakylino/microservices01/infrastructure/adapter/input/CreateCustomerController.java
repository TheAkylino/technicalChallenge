package com.theakylino.microservices01.infrastructure.adapter.input;

import com.theakylino.microservices01.application.dto.CreateCustomerRequest;
import com.theakylino.microservices01.application.port.input.CreateCustomerPort;
import com.theakylino.microservices01.domain.port.input.CreateCustomerUseCase;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CreateCustomerController implements CreateCustomerPort {

  @Autowired

  private CreateCustomerUseCase useCase;

  /**
   * Añade un nuevo cliente.
   *
   * @param customer El cliente a ser añadido.
   * @return ResponseEntity que contiene el cliente añadido y el estado HTTP CREATED si es exitoso.
   */
  @Override
  public ResponseEntity<CreateCustomerRequest> addCustomer(final CreateCustomerRequest request) {
    return Optional.of(request)
        .flatMap(customers -> useCase.addCustomer(request))
        .map(taskCreated -> ResponseEntity.status(HttpStatus.CREATED).body(request))
        .get();
  }
}
