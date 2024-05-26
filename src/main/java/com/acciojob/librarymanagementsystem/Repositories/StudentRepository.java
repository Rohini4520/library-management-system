package com.acciojob.librarymanagementsystem.Repositories;

import com.acciojob.librarymanagementsystem.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer>{


}
