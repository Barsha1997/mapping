package com.example.mapping.Service;

import com.example.mapping.Entity.CourseEntity;
import com.example.mapping.Entity.StudentEntity;
import com.example.mapping.Model.CourseModel;
import com.example.mapping.Model.StudentModel;
import com.example.mapping.Repository.CourseRepository;
import com.example.mapping.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import javax.persistence.EntityNotFoundException;
//import java.util.ArrayList;
import java.util.List;

@Service
public class CourseStudentService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;
/**

 **/
   public  String saveCourse(StudentModel studentModel){
    StudentEntity studentEntity = new StudentEntity();
    studentEntity.setStdName(studentModel.getStdName());

    List<CourseModel> courseModelList = studentModel.getCourseModelList();

    for(CourseModel courseModel:courseModelList){
        CourseEntity courseEntity = new CourseEntity();
        courseEntity.setCourseName(courseModel.getCourseName());
        courseEntity.setCourseDescription(courseEntity.getCourseDescription());
        courseEntity.setCourseNo(courseEntity.getCourseNo());


        studentEntity.addCourse(courseEntity);
    }
    try{
        studentRepository.save(studentEntity);
    }catch (Exception e){
        System.err.println(e.getMessage());
    }
       return "successufully written";
   }
}
