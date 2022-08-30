package com.exercise.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.IOException;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ApiApplication {


    public static void main(String[] args) throws IOException, InterruptedException , PostNotFoundException{
        SpringApplication.run(ApiApplication.class, args);
        System.out.println(Controller.getPosts());
    }


}
