package com.crudOperation.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudOperation.web.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
