package com.theakylino.microservices02.domain.port.input.impl;

import com.theakylino.microservices02.domain.model.Task;
import com.theakylino.microservices02.domain.port.input.CreateTaskUseCase;
import com.theakylino.microservices02.domain.port.output.TaskRepositoryPort;
import java.util.Optional;


public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

  private final TaskRepositoryPort repositoryPort;

  public CreateTaskUseCaseImpl(final TaskRepositoryPort repositoryPort) {
    this.repositoryPort = repositoryPort;
  }

  /**
   * Crea una nueva tarea.
   *
   * @param El objecto task crea una nueva tarea.
   * @return La tarea creada.
   */
  @Override
  public Optional<Task> createTask(final Task task) {
    return repositoryPort.save(task);
  }
}
