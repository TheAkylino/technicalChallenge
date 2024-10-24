package com.theakylino.microservices02.infrastructure.config;

import com.theakylino.microservices02.domain.port.input.impl.CreateTaskUseCaseImpl;
import com.theakylino.microservices02.domain.port.output.TaskRepositoryPort;
import com.theakylino.microservices02.infrastructure.adapter.output.JpaTaskRepository;
import com.theakylino.microservices02.infrastructure.adapter.output.JpaTaskRepositoryAdapter;
import com.theakylino.microservices02.infrastructure.mapper.TaskMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

  private final TaskRepositoryPort taskRepositoryPort;
  private final JpaTaskRepository repository;
  private final TaskMapper taskMapper;

  public ApplicationConfig(final TaskRepositoryPort taskRepositoryPort,
      final JpaTaskRepository repository,
      final TaskMapper taskMapper) {
    this.taskRepositoryPort = taskRepositoryPort;
    this.repository = repository;
    this.taskMapper = taskMapper;
  }

  @Bean
  public CreateTaskUseCaseImpl createTaskUseCase() {
    return new CreateTaskUseCaseImpl(taskRepositoryPort);
  }

  @Bean
  public JpaTaskRepositoryAdapter createObjecRepository() {
    return new JpaTaskRepositoryAdapter(repository, taskMapper);
  }
}
