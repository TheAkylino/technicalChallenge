package com.theakylino.microservices02.domain.port.input;

public interface DeleteTaskUseCase {

  boolean deleteTask(Long id);
}
