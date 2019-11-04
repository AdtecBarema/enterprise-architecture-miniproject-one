package com.techprimers.EAMiniProjectOne.repository;

import com.techprimers.EAMiniProjectOne.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
