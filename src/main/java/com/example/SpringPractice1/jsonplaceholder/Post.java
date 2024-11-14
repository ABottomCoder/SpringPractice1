package com.example.SpringPractice1.jsonplaceholder;

public class Post {
    private final Integer UserId;
    private final Integer id;
    private final String title;
    private final String body;

    public Post(Integer userId, Integer id, String title, String body) {
        UserId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Integer getUserId() {
        return UserId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "UserId=" + UserId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
