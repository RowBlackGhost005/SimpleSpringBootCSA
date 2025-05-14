package com.marin.controller;

import com.marin.entity.Student;
import com.marin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/students")
    public @ResponseBody List<Student> fetchStudentList(){
        return studentService.fetchStudentList();
    }


    @PutMapping("/students/{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable int id){
        return studentService.updateStudent(student, id);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudentById(@PathVariable int id){
        studentService.deleteStudentById(id);
        return "Deleted Successfully";
    }
}
