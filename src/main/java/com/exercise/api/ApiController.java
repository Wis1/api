package com.exercise.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RequiredArgsConstructor
@RestController
public class ApiController {

    private final RestTemplate restTemplate;

    public ResponseEntity<String> getPosts() {

        URI url= UriComponentsBuilder.fromHttpUrl("https://jsonplaceholder.typicode.com")
                .path("/posts")
                .build().encode().toUri();
        return ResponseEntity.ok(restTemplate.getForObject(url,String.class));

    }
}
