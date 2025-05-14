package com.marin.repository;

import org.springframework.data.repository.CrudRepository;

import com.marin.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
