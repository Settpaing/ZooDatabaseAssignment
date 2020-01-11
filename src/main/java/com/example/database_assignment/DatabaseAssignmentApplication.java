package com.example.database_assignment;

import com.example.database_assignment.service.IDatabase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DatabaseAssignmentApplication {

    private final IDatabase iDatabase;

    public DatabaseAssignmentApplication(IDatabase iDatabase) {
        this.iDatabase = iDatabase;
    }

    public static void main(String[] args) {
        SpringApplication.run(DatabaseAssignmentApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(){
        return args -> {
          iDatabase.createDatabase();
        };
    }
}
