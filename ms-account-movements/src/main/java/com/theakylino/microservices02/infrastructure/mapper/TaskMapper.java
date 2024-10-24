package com.theakylino.microservices02.infrastructure.mapper;


import com.theakylino.microservices02.domain.model.Task;
import com.theakylino.microservices02.infrastructure.entities.TaskEntity;

import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public abstract class TaskMapper {

  public abstract TaskEntity fromDomainModel(Task task);

  public abstract Task fromModelDomain(TaskEntity task);
}
