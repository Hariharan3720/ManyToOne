package com.example.ManyToOne.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Dept_Table")
public class Department {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
   // @Column(name = "dept_id")
    private  String deptId;
    private String deptName;
    @OneToMany(mappedBy ="department",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Student> student;
}