package com.example.mapping.Repository;

import com.example.mapping.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {

}
