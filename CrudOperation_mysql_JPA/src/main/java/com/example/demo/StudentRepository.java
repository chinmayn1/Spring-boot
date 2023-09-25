package com.example.demo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.*;
import com.example.demo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
