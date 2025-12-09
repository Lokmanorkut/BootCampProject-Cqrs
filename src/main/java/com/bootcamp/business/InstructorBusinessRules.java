package com.bootcamp.business;

import com.bootcamp.persistence.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InstructorBusinessRules {
    private final InstructorRepository instructorRepository;

    public void checkIfInstructorAlreadyExists(String nationalId) {
        if (instructorRepository.existsByNationalId(nationalId)) {
            throw new RuntimeException("Bu eğitmen zaten kayıtlı!");
        }
    }
}
