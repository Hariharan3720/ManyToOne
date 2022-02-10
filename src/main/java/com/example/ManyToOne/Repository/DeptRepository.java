package com.example.ManyToOne.Repository;

import com.example.ManyToOne.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepository extends JpaRepository<Department,String> {
}