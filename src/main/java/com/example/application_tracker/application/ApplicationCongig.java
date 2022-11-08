package com.example.application_tracker.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class ApplicationCongig {

    @Bean
    CommandLineRunner commandLineRunner(ApplicationRepository repository){
        return args -> {
            Application google = new Application(1, "Google", "SDE",
                    "www.google.com", "Applied", LocalDate.now());
            Application fb = new Application("fb", "SDE",
                    "www.fb.com", "Applied", LocalDate.now());
            repository.saveAll(List.of(google,fb));
        };
    }
}
