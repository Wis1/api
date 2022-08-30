package com.exercise.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;

public class Controller {

    public static ResponseEntity<String> getPosts() throws IOException, InterruptedException, PostNotFoundException {

        HttpClient httpClient= HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(Url.urlMaker())
                .GET()
                .build();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Post[] posts =gson.fromJson(response.body(), Post[].class);

        return ResponseEntity.ok(Arrays.toString(posts));
    }
}
