//package com.example.mapping.Controller;
//
//import com.example.mapping.Entity.StudentEntity;
//import com.example.mapping.Model.StudentModel;
//import com.example.mapping.Repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/student")
//public class StudentController {
//
//    @Autowired
//    StudentRepository studentRepository;
//
//    @Autowired
//    StudentService studentService;
//
//    @PostMapping("/save")
//    public  String save(@RequestBody StudentModel studentModel){
//        String returnMessage = this.studentService.save(studentModel);
//        return returnMessage ;
//    }
//
//    @GetMapping("/get")
//    public List<StudentEntity> findAll(){
//       return studentRepository.findAll();
//    }
//
////    @GetMapping("/get/{stdId}")
////    public  StudentEntity findStudent(@PathVariable  Integer stdId){
////        return  studentRepository.findById(stdId).orElse(null);
////    }
//
////    @GetMapping("/getByName")
////    public List<StudentEntity>  findStudentContainingByName(@PathVariable String stdName){
////        return studentRepository.findByNameContaining(stdName);
////    }
//
//
//}
