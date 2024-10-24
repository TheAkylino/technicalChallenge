package com.theakylino.microservices02.domain.port.output;

import com.theakylino.microservices02.domain.model.Task;
import java.util.Optional;


public interface TaskRepositoryPort {

  Optional<Task> save(Task task);
}
