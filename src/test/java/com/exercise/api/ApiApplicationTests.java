package com.exercise.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;


@SpringBootTest
class ApiApplicationTests {


    @Autowired
    private ApiController apiController;

    @Test
    void contextLoads() throws IOException, InterruptedException, PostNotFoundException {
        System.out.println(Controller.getPosts());
        System.out.println(apiController.getPosts());
    }

}
