package com.theakylino.microservices01.domain.port.input;

import com.theakylino.microservices01.application.dto.CreateCustomerRequest;
import java.util.Optional;

public interface CreateCustomerUseCase {

  Optional<CreateCustomerRequest> addCustomer(CreateCustomerRequest request);
}
