package com.marin.service;

import com.marin.entity.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> fetchStudentList();

    Student updateStudent(Student student, int id);

    void deleteStudentById(int studentId);
}
