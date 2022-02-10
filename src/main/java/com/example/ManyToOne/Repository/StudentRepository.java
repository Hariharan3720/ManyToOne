
package com.example.ManyToOne.Repository;

import com.example.ManyToOne.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {

}