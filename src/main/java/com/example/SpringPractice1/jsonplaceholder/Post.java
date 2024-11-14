package com.example.SpringPractice1.jsonplaceholder;

import lombok.Data;

@Data
public class Post {
    private final Integer UserId;
    private final Integer id;
    private final String title;
    private final String body;
}
