package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.model.Student;
import com.klu.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService service;

    // Welcome
    @GetMapping("/greet")
    public String getWelcomeMessage() {
        return service.getWelcomeMessage();
    }

    // Create student
    @PostMapping("/student/add")
    public Student createStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }

    // Get all students
    @GetMapping("/student/getall")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // Get student by id
    @GetMapping("/student/getid/{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    // Update student
    @PutMapping("/student/update/{id}")
    public Student updateStudent(@PathVariable int id, 
                                 @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    // Delete student
    @DeleteMapping("/student/del/{id}")
    public String deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }

    // Search student by name
    @GetMapping("/student/search/{name}")
    public List<Student> searchStudent(@PathVariable String name) {
        return service.searchStudent(name);
    }
}
