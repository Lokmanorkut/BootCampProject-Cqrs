package com.bootcamp.persistence;

import com.bootcamp.domain.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant, Integer> {
    boolean existsByNationalId(String nationalId);
}
