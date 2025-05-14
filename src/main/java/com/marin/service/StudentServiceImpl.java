package com.marin.service;

import com.marin.entity.Student;
import com.marin.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> fetchStudentList(){
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student, int id) {
        Student studentDB = studentRepository.findById(id).get();

        if(Objects.nonNull(student.getName()) && !student.getName().isBlank()){
            studentDB.setName(student.getName());
        }

        if(Objects.nonNull(student.getEmail()) && !student.getEmail().isBlank()){
            studentDB.setEmail(student.getEmail());
        }

        if(student.getAge() > 0){
            studentDB.setAge(student.getAge());
        }

        return studentRepository.save(studentDB);
    }

    @Override
    public void deleteStudentById(int studentId) {
        studentRepository.deleteById(studentId);
    }

}
