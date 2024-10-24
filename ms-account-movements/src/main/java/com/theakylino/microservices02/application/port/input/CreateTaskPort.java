package com.theakylino.microservices02.application.port.input;

import com.theakylino.microservices02.domain.model.Task;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Validated
@Tag(name = "Crear Tarea en el jira",
    description = "Servicios para crear una nueva tarea en el jira")
public interface CreateTaskPort {


  @Operation(
      operationId = "newTask",
      summary = "Servicios para crear una nueva tarea en el jira",
      description = "Servicios para crear una nueva tarea en el jira",
      tags = "Servicios Privados",
      responses = {
          @ApiResponse(
              responseCode = "201",
              description = "Nueva tarea creada en el jira",
              content =
              @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "400",
              description = "Error creando una nueva tarea creada en el jira",
              content =
              @Content(
                  mediaType = "application/json"))
      })
  @PostMapping(value = "/addTask", produces = "application/json", consumes = "application/json")
  default ResponseEntity<Task> addTask(
      @Parameter(
          name = "Task",
          description = "Crear tarea",
          schema = @Schema)
      @Valid
      @RequestBody final Task task) {
    return null;
  }
}
