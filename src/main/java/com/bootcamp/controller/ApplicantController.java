package com.bootcamp.controller;

import com.bootcamp.application.ApplicantService;
import com.bootcamp.application.dto.CreateApplicantRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/applicants")
@RequiredArgsConstructor
public class ApplicantController {
    private final ApplicantService applicantService;
    @PostMapping
    public ResponseEntity<Void> add(@Valid @RequestBody CreateApplicantRequest request) {
        applicantService.add(request);
        return ResponseEntity.ok().build();
    }
}

