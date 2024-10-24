package com.theakylino.microservices01.infrastructure.adapter.output;


import com.theakylino.microservices01.infrastructure.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCustomerRepository extends JpaRepository<CustomerEntity, String> {

}
