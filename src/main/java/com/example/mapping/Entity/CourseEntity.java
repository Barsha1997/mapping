package com.example.mapping.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="Course")
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    @Column(name="course_name")
    private String courseName;

//    @ManyToMany(mappedBy = "courseEntitySet")
//    private Set<StudentEntity> studentEntities = new HashSet<>();


}
