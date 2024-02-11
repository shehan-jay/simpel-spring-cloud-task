package com.example.simplespringcloudtask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyTask implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        // Your task logic goes here
        System.out.println("Executing my Spring Cloud Task!");
    }
}
