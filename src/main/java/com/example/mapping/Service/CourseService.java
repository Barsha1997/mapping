//package com.example.mapping.Service;
//
//import com.example.mapping.Entity.CourseEntity;
//import com.example.mapping.Model.CourseModel;
//import com.example.mapping.Repository.CourseRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CourseService {
//
//    @Autowired
//    private CourseRepository courseRepository;
//    public  String saveCourse(CourseModel courseModel){
//        CourseEntity courseEntity = new CourseEntity();
//        courseEntity.setCourseName(courseModel.getCourseName());
//
//        try{
//            courseRepository.save(courseEntity);
//        }catch (Exception e){
//            System.err.println("error details::"+e.getMessage());
//        }
//        return "saved";
//    }
//
//
//
//}
