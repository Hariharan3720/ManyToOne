package com.example.ManyToOne.Controller;

import com.example.ManyToOne.Entity.Department;
import com.example.ManyToOne.Entity.Dto;
import com.example.ManyToOne.Entity.Student;
import com.example.ManyToOne.Repository.DeptRepository;
import com.example.ManyToOne.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    DeptRepository deptRepository;
   // @Autowired
    private List<Student> student;

    @PostMapping("/addDetail")
    public String addInfo(@RequestBody Department department){
        deptRepository.save(department);
        return  "posted Successfully";
    }
    /*@GetMapping("/getInfo")
    public String addDetail(){
        Department department=new Department();
        Student student=new Student();
        department.setDeptName("IT");
        student.setStudentName("hari");
        student.setAge(21);
        student.setStudentName("prakash");
        student.setAge(22);
        department.setStudent((List<Student>) student);
        deptRepository.save(department);
        return "get successfully";
    }*/
    /*@PostMapping("/")
    public Student addDto(@RequestBody Dto  dto){
Department department=new Department();
department.setDeptName(dto.getDeptName());
Department department1=deptRepository.save(department);
Student student1=new Student();
//List<Student> list =new ArrayList<>();
//student1.setstudent(dto.getStudent());
//student1.setAge(dto.getAge());
        student1.set
Student std=studentRepository.save(student1);
std.setDepartment(department1);
return std;
    }*/
    @PostMapping("/")
    public Student addDto(@RequestBody Dto  dto) {
        Department  department=new Department();
       department.setDeptName(dto.getDeptName());
       department.setStudent(student);
       Department dept=deptRepository.save(department);
        Student stud=new Student();
       stud.setDepartment(dept);
       Student stt=studentRepository.save(stud);
       stt.setDepartment(dept);
       return stt;
    }
    @DeleteMapping("/deleteMapping/{deptId}")
    public String deleteInfo(@PathVariable ("deptId") String deptId){
        deptRepository.deleteById(deptId);
        return "Mission Fail";
    }
    @PutMapping("/updateInfo/{deptId}")
    public Student addStudent(@PathVariable("deptId") String deptId,@RequestBody Student student){
        Department dep=deptRepository.getById(deptId);
       // Department dtt=dep.get();
      //  return dep;
       // Department depart=new Department();
        Student std=new Student();


       // List<Student> std=new ArrayList<>();
        std.setDepartment(dep);
       std.setStudentName(student.getStudentName());
       std.setAge(student.getAge());

       return studentRepository.save(std);
    }
    }


