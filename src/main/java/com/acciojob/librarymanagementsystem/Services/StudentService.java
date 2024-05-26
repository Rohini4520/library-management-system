package com.acciojob.librarymanagementsystem.Services;


import com.acciojob.librarymanagementsystem.Models.Student;
import com.acciojob.librarymanagementsystem.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class StudentService {

    @Autowired

    private StudentRepository studentRepository;

    public String addStudent(Student student){

        studentRepository.save(student);

        return "student has been saved to the DB";
    }

    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }

}
