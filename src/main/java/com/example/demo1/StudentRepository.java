package com.example.demo1;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRepository {
    static HashMap<Integer,Student> db = new HashMap<>();

    public static void addStudent(Student student) {
        db.put(student.getRegNo(), student);
        return;
    }

    public Student getStudent(int regNo){
        return db.get(regNo);
    }

    public Student getStudentUsingPath(int regNo) {
        return db.get(regNo);
    }

    public Student updateAge(int regNo, int newAge) {
        db.get(regNo).setAge(newAge);
        return db.get(regNo);
    }
}
