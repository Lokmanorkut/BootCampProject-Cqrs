package com.bootcamp.business;

import com.bootcamp.persistence.ApplicantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ApplicantBusinessRules {
    private final ApplicantRepository applicantRepository;

    public void checkIfApplicantExists(String nationalId) {
        if (applicantRepository.existsByNationalId(nationalId)) {
            throw new IllegalArgumentException("This applicant already exists!");
        }
    }
}
