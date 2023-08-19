package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student getStudent(int regNo){
        Student student = studentRepository.getStudent(regNo);
        return student;
    }

    public String addStudent(Student student) {
        StudentRepository.addStudent(student);
        return "Student has been added successfully.";
    }

    public Student getStudentUsingPath(int regNo) {
       return studentRepository.getStudentUsingPath(regNo);
    }

    public Student updateAge(int regNo, int newAge) {
        return studentRepository.updateAge(regNo,newAge);
    }
}
