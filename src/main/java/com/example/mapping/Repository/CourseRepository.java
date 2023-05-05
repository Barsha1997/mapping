package com.example.mapping.Repository;

import com.example.mapping.Entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<CourseEntity,Integer> {
}
