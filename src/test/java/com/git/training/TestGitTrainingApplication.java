package com.git.training;

import org.springframework.boot.SpringApplication;

public class TestGitTrainingApplication {

    public static void main(String[] args) {
        SpringApplication.from(GitTrainingApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
