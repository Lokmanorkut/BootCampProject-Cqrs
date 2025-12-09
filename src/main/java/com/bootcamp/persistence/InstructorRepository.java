package com.bootcamp.persistence;

import com.bootcamp.domain.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Integer> {
    boolean existsByNationalId(String nationalId);
}
