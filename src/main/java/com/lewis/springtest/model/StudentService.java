package com.lewis.springtest.model;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// Business/Service Layer
@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Dave",
                        "dave.bigger@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 7),
                        23
                )
        );
    }
}
