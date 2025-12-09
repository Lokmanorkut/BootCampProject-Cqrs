package com.bootcamp.application.impl;

import com.bootcamp.application.ApplicantService;
import com.bootcamp.application.dto.CreateApplicantRequest;
import com.bootcamp.business.ApplicantBusinessRules;
import com.bootcamp.domain.Applicant;
import com.bootcamp.persistence.ApplicantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicantServiceImpl implements ApplicantService {
    private final ApplicantBusinessRules rules;
    private final ApplicantRepository applicantRepository;

    @Override
    public void add(CreateApplicantRequest request) {
        rules.checkIfApplicantExists(request.getNationalId());


        Applicant applicant = new Applicant();
        applicant.setFirstName(request.getFirstName());
        applicant.setLastName(request.getLastName());
        applicant.setNationalId(request.getNationalId());
        applicant.setBirthDate(request.getBirthDate());

        applicantRepository.save(applicant);
    }
}
