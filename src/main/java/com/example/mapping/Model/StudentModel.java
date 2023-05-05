package com.example.mapping.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StudentModel {

    private int stdId;
    private String stdName;
    private List<CourseModel> courseModelList;
}
