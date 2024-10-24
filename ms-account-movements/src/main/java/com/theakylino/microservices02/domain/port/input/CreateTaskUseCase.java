package com.theakylino.microservices02.domain.port.input;

import com.theakylino.microservices02.domain.model.Task;
import java.util.Optional;


public interface CreateTaskUseCase {

  Optional<Task> createTask(Task task);
}
