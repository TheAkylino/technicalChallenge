package com.theakylino.microservices01.domain.port.output;

import com.theakylino.microservices01.application.dto.CreateCustomerRequest;
import java.util.Optional;

public interface CreateCustomerRepositoryPort {

  Optional<CreateCustomerRequest> save(CreateCustomerRequest request);
}
