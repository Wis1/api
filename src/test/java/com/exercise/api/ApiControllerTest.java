package com.exercise.api;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.lenient;

@ExtendWith(MockitoExtension.class)
public class ApiControllerTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private ApiController apiController;

    @Test
    public void shouldFetchPosts() {
        // Given
        Post[] post=new Post[1];
        post[0]=new Post(1L,1L,"test","test");
        lenient().when(restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts",String.class)).thenReturn(Arrays.toString(post));
        // When
        ResponseEntity<String> response=apiController.getPosts();
        // Then
        assertEquals(200,response.getStatusCodeValue());
    }
}
