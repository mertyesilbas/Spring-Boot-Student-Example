package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student merdo = new Student("Merdo", "merdo@gmail.com", LocalDate.of(1999, APRIL, 24) );
            Student ali = new Student("Ali", "ali@gmail.com", LocalDate.of(2000, JANUARY, 4) );

            repository.saveAll(List.of(merdo, ali));
        };
    }
}
