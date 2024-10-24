package com.theakylino.microservices01.infrastructure.mapper;

import com.theakylino.microservices01.application.dto.CreateCustomerRequest;
import com.theakylino.microservices01.domain.model.Customer;
import com.theakylino.microservices01.infrastructure.entities.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class CustomerMapper {

  // Método existente para mapear del dominio a la entidad
  // public abstract CustomerEntity fromDomainInfrastructure(Customer customer);

  // Método existente para mapear de la entidad al dominio
  //public abstract Customer fromInfrastructurDomain(CustomerEntity entity);

  public abstract CreateCustomerRequest fromEntityToDto(CustomerEntity entity);

  // Método nuevo para mapear CreateCustomerRequest a CustomerEntity directamente
  public abstract CustomerEntity fromDtoToEntity(CreateCustomerRequest request);

  // También puedes tener un método que mapee CreateCustomerRequest a Customer si lo necesitas
  public abstract Customer fromDtoToDomain(CreateCustomerRequest request);
}
