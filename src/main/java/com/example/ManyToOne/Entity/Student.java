package com.example.ManyToOne.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student_Table")
public class Student {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    //@Column(name = "pk_id")
    private String studentId;
    private String studentName;
    private Integer age;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "Fk_id")
    private Department department;
}