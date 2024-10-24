package com.theakylino.microservices01.infrastructure.adapter.output;

import com.theakylino.microservices01.application.dto.CreateCustomerRequest;
import com.theakylino.microservices01.domain.port.output.CreateCustomerRepositoryPort;
import com.theakylino.microservices01.infrastructure.mapper.CustomerMapper;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JpaCustomerRepositoryAdapter implements CreateCustomerRepositoryPort {

  @Autowired
  private JpaCustomerRepository jpaCustomerRepository;
  @Autowired
  private CustomerMapper customerMapper;

  /**
   * Guarda un cliente.
   *
   * @param request El cliente a ser guardado.
   * @return Optional que contiene el cliente guardado si la operación es exitosa.
   */
  @Override
  public Optional<CreateCustomerRequest> save(final CreateCustomerRequest request) {
    return Optional.of(Optional.of(request)
        .map(dtoToEntity -> customerMapper.fromDtoToEntity(request))
        .map(jpaCustomerRepository::save)
        .map(entityToDto -> customerMapper.fromEntityToDto(entityToDto))
        .get());

  }
}
