package com.theakylino.microservices02.domain.port.input;

import com.theakylino.microservices02.domain.model.Task;
import java.util.Optional;

public interface UpdateTaskUseCase {

  Optional<Task> updateTask(Long id, Task updatedTask);
}
