package com.marin.entity;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@JsonPOJOBuilder

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int studentId;
    private String name;
    private String email;
    private int age;

    public Student() {
    }

    public Student(int studentId, String name, String email, int age) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public int getId() {
        return studentId;
    }

    public void setId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
