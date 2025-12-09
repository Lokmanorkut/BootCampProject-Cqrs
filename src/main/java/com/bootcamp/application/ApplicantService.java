package com.bootcamp.application;

import com.bootcamp.application.dto.CreateApplicantRequest;

public interface ApplicantService {
    void add(CreateApplicantRequest request);
}
