package com.exercise.api;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class Api {

    public static String getPosts() {
        final RestTemplate restTemplate = new RestTemplate();
        URI url= UriComponentsBuilder.fromHttpUrl("https://jsonplaceholder.typicode.com")
                .path("/posts")
                .build().encode().toUri();
        String response=restTemplate.getForObject(url,String.class);
        return response;
    }
}
