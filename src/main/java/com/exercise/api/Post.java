package com.exercise.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = false)
public class Post {

    @JsonProperty("userId")
    private Long userId;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("body")
    private String body;

    @Override
    public String toString() {
        return  "\n"+
                "     \"userid\": " + userId +"\n"+
                "     \"id\": " + id +"\n"+
                "     \"title\": " + title  +"\n"+
                "     \"body\": " + body  +"\n"+
                '}'+"\n";
    }
}
