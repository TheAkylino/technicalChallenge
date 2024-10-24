package com.theakylino.microservices02.infrastructure.adapter.output;

import com.theakylino.microservices02.domain.model.Task;
import com.theakylino.microservices02.domain.port.output.TaskRepositoryPort;
import com.theakylino.microservices02.infrastructure.mapper.TaskMapper;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class JpaTaskRepositoryAdapter implements TaskRepositoryPort {

  private final JpaTaskRepository repository;
  private final TaskMapper taskMapper;

  public JpaTaskRepositoryAdapter(final JpaTaskRepository repository, final TaskMapper taskMapper) {
    this.repository = repository;
    this.taskMapper = taskMapper;
  }

  /**
   * Crea una nueva tarea.
   *
   * @param El objecto task crea una nueva tarea.
   * @return La tarea creada.
   */
  @Override
  public Optional<Task> save(final Task task) {
    return Optional.ofNullable(
        Optional.of(task)
            .map(mapper -> taskMapper.fromDomainModel(task))
            .map(repository::save)
            .map(taskMapper::fromModelDomain)).get();
  }
}
