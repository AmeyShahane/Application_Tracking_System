package com.example.application_tracker;

import com.example.application_tracker.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class ApplicationTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationTrackerApplication.class, args);
    }

}
