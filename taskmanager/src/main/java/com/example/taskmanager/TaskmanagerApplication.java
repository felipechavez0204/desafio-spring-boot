package com.example.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info = @Info(title = "Task Manager API", version = "1.0", description = "API for managing users and tasks"))
@SpringBootApplication
public class TaskmanagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskmanagerApplication.class, args);
    }
}