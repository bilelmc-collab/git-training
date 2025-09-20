package com.git.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTrainingApplication {

    public static void main(String[] args) {
        System.out.println("change 2!");
        System.out.println("change 3!");

        SpringApplication.run(GitTrainingApplication.class, args);
    }

}
