package com.example.JavaCRUD.student;

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
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student Truth =
                    new Student( "Truth", "truth@gmail.com", LocalDate.of(1998, AUGUST, 19));
            Student John =
                    new Student( "john", "john@gmail.com", LocalDate.of(2000, AUGUST, 4));
            repository.saveAll(List.of(Truth, John));

        };
    }


}
