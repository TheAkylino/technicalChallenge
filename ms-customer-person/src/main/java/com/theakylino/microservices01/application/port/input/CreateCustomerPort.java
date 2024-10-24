package com.theakylino.microservices01.application.port.input;

import com.theakylino.microservices01.application.dto.CreateCustomerRequest;
import com.theakylino.microservices01.domain.model.Customer;
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
public interface CreateCustomerPort {

  @Operation(operationId = "newTask", summary = "Servicios para crear una nueva tarea en el jira",
      description = "Servicios para crear una nueva tarea en el jira",
      tags = "Servicios Privados", responses = {
      @ApiResponse(responseCode = "201", description = "Nueva tarea creada en el jira",
          content = @Content(mediaType = "application/json")),
      @ApiResponse(responseCode = "400",
          description = "Error creando una nueva tarea creada en el jira",
          content = @Content(mediaType = "application/json"))})
  @PostMapping(value = "/createCustomer", produces = "application/json", consumes = "application/json")
  default ResponseEntity<CreateCustomerRequest> addCustomer(
      @Parameter(name = "Task", description = "Crear tarea",
          schema = @Schema)
      @Valid @RequestBody final CreateCustomerRequest request) {
    return null;
  }
}
