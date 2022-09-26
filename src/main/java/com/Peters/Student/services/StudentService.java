package com.Peters.Student.services;

import com.Peters.Student.entity.Student;

import java.util.List;

public interface StudentService {

    public Student createStudent(Student student);

    public List<Student> getAllStudents();

    public Student getStudentById(Long id);

    public void deleteStudentById(Long id);

    public Student updateStudentById(Long id, Student student);

    public Student getStudentByName(String name);
}
