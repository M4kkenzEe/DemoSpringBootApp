package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student yurii = new Student(
                    "Yurii",
                    "yurii.post@example.ru",
                    LocalDate.of(2001, FEBRUARY, 3)
            );

            Student alex = new Student(
                    "Alex",
                    "alex.post@example.com",
                    LocalDate.of(2004, APRIL, 16)
            );

            repository.saveAll(List.of(yurii, alex));
        };
    }
}
