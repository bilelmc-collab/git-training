package com.git.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTrainingApplication {

    public static void main(String[] args) {
         System.out.println("change 2!");
        System.out.println("change 3!");
        System.out.println("change 4!");
        System.out.println("change 5 edited in local repository!");
        System.out.println("change 6 in new branch num 1!");
        System.out.println("change 7 in new branch num 1 change from remote repository!!");
        System.out.println("change 7 in new branch num 1 change from local repository!");
        SpringApplication.run(GitTrainingApplication.class, args);
    }

}
