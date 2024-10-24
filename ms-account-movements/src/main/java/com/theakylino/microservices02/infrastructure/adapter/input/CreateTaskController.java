package com.theakylino.microservices02.infrastructure.adapter.input;

import com.theakylino.microservices02.application.port.input.CreateTaskPort;
import com.theakylino.microservices02.domain.model.Task;
import com.theakylino.microservices02.domain.port.input.CreateTaskUseCase;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class CreateTaskController implements CreateTaskPort {

  private final CreateTaskUseCase useCase;

  public CreateTaskController(final CreateTaskUseCase useCase) {
    this.useCase = useCase;
  }

  /**
   * Crea una nueva tarea.
   *
   * @param El objecto task crea una nueva tarea.
   * @return La tarea creada.
   */
  @Override
  public ResponseEntity<Task> addTask(final Task task) {
    return Optional.of(task)
        .flatMap(creatingTask -> useCase.createTask(task))
        .map(taskCreated -> ResponseEntity.status(HttpStatus.CREATED).body(taskCreated))
        .get();
  }
}
