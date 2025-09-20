package com.git.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTrainingApplication {

    public static void main(String[] args) {
         System.out.println("change 2!");
        System.out.println("change 3!");
        System.out.println("change 4!");
        System.out.println("change 5 edited in remote repository!");
        SpringApplication.run(GitTrainingApplication.class, args);
    }

}
