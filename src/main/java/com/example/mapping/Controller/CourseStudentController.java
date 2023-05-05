package com.example.mapping.Controller;

import com.example.mapping.Model.StudentModel;
import com.example.mapping.Service.CourseStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studentCourse")
public class CourseStudentController {
    @Autowired
    CourseStudentService courseStudentService;

    @PostMapping("/add")
    public void addCourse(@RequestBody StudentModel studentModel) {
        courseStudentService.saveCourse(studentModel);
    }


}
