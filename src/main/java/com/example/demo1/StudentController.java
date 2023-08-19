package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentController {
    //Entry point for API request
    //Controller class contains APIs

    @Autowired
    StudentService studentService;
    @GetMapping("/get")     //endpoint
    public Student getStudent(@RequestParam("q") int regNo){    //request parameter: 1.take parameter as input in the URL(not part of endpoint)
        //logic to get student details
        return studentService.getStudent(regNo);
    }//when input has large number of values we make as request param. eg. search menu

    //path variable: make variable a part of Url endpoint
    @GetMapping("/getByPath/{id}")
    public Student getStudentUsingPath(@PathVariable("id") int regNo){
        return studentService.getStudentUsingPath(regNo);
    }//if inputs are limited and defined then we add as path variable

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        String result = studentService.addStudent(student);
        return result;
    }

    @PutMapping("/update-age/{id}")
    public Student updateAge(@PathVariable("id") int regNo, @RequestParam("age") int newAge){
        return studentService.updateAge(regNo,newAge);

    }
    //delete a Student --> request param


    //delete a student --> path Variable


    //change Course of a student --> Both as request param


    //change  course of a Student --> Both as path variables


    //change course --> one as request param, one as Path variable


    //change course and age -->regNo as request param, entire student object as request body



    //client --> controller --> service -->repository
    //controller: List of all APIs like index of book
    //service: Business logic of each API
    //Repository: deals with Database


    //model classes: classes stored in database which carry data. controller, service and respository are not model classes.
    //change port number of server
    //resources - application.properties - write: "server.port=9999"

}
