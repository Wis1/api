package com.exercise.api;

import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
public class Url {
    public static URI urlMaker(){
        return UriComponentsBuilder.fromHttpUrl("https://jsonplaceholder.typicode.com")
                .path("/posts")
                .build().encode().toUri();
    }
}
