package com.Peters.Student.controller;

import com.Peters.Student.entity.Student;
import com.Peters.Student.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class StudentController {

    @Autowired
    private final StudentService studentService;


    public StudentController( StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/index")
    public String getPage(){
        return "index";
    }

    @GetMapping("/students/all")
    public ResponseEntity<Object> getAllStudents(){
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.ACCEPTED);
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable("id") Long id){
        return studentService.getStudentById(id);
    }
    @PostMapping("/students/{id}")
    public void deleteStudentById(@PathVariable("id") Long id){
         studentService.deleteStudentById(id);
    }
    @PutMapping("students/{id}")
    public Student updateStudentById(@PathVariable("id") Long id, @RequestBody Student student){
        return studentService.updateStudentById(id, student);
    }
    @GetMapping("students/name/{name}")
    public Student getStudentByName(@PathVariable("name") String name){
        return studentService.getStudentByName(name);

    }
}
