package com.assignment.one.one.repository;

import com.assignment.one.one.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
