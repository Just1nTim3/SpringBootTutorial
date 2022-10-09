package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudendService {

    public List<Student> getStudents(){
        System.out.println("Method was called");
        return List.of(
                new Student(
                        "12",
                        "Marek",
                        "marek@gmail.com",
                        12,
                        LocalDate.of(2002, Month.FEBRUARY, 12)
                )
        );
    }
}
