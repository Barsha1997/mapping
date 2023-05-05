//package com.example.mapping.Controller;
//
//import com.example.mapping.Entity.CourseEntity;
//import com.example.mapping.Model.CourseModel;
//import com.example.mapping.Repository.CourseRepository;
//import com.example.mapping.Service.CourseService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/course")
//public class CourseController {
//
//    @Autowired
//    CourseService courseService;
//
//    @Autowired
//    CourseRepository courseRepository;
//
//    @PostMapping("/save")
//    public  String save(@RequestBody CourseModel courseModel){
//        String returnMessage = this.courseService.saveCourse(courseModel);
//         return returnMessage ;
//    }
//
//    @GetMapping("/get")
//    public List<CourseEntity> findCourseByName(@PathVariable  String courseName){
//        return  courseRepository.findAll();
//    }
//
//}
