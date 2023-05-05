//package com.example.mapping.Service;
//
//import com.example.mapping.Entity.CourseEntity;
//import com.example.mapping.Entity.StudentEntity;
//import com.example.mapping.Model.CourseModel;
//import com.example.mapping.Model.StudentModel;
//import com.example.mapping.Repository.CourseRepository;
//import com.example.mapping.Repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Service
//public class StudentService {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @Autowired
//    CourseEntity courseEntity;
//    public  String save(StudentModel studentModel){
//        StudentEntity studentEntity = new StudentEntity();
//        studentEntity.setStdName(studentModel.getStdName());
//        Set<CourseEntity> courseEntitySet= new HashSet<>();
//        courseEntitySet = this.courseEntity.getCourseName();
//        try{
//            studentRepository.save(studentEntity);
//        }catch (Exception e){
//            System.err.println("error details::"+e.getMessage());
//        }
//        return "saved";
//    }
//}
