package com.theakylino.microservices02.domain.port.input;

import com.theakylino.microservices02.domain.model.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {

  AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
