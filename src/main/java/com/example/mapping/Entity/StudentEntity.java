package com.example.mapping.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stdId;

    @Column(name="student_name")
    private String stdName;


    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    //mapping table
    @JoinTable(name="student_course",
            joinColumns={@JoinColumn(name = "stdId")},
            inverseJoinColumns = {@JoinColumn(name = "courseId")})
    private Set<CourseEntity> courseEntitySet= new HashSet<>();


    public  void addCourse(CourseEntity courseEntity){
        this.courseEntitySet.add(courseEntity);
    }
}
