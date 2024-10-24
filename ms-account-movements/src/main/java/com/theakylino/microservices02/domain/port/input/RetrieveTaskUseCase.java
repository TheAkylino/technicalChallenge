package com.theakylino.microservices02.domain.port.input;

import com.theakylino.microservices02.domain.model.Task;
import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {

  Optional<Task> getTaskById(Long id);

  List<Task> getAllTasks();
}
