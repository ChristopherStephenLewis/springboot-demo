package com.lewis.springtest.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student dave = new Student(
                    "Dave",
                    "dave.runner@gmail.com",
                    LocalDate.of(2012, Month.AUGUST, 7)
            );

            Student sarah = new Student(
                    "Sarah",
                    "sarah.glick@gmail.com",
                    LocalDate.of(2010, Month.FEBRUARY, 12)
            );

            repository.saveAll(List.of(dave, sarah));
        };
    }
}
