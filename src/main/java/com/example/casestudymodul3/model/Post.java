package com.example.casestudymodul3.model;

import java.time.format.DateTimeFormatter;

public class Post {
    private int idPost;
    private String username;
    private String img;
    private String content;
    private String time;

    public Post() {
    }

    public Post(String username, String img, String content, String time) {
        this.username = username;
        this.img = img;
        this.content = content;
        this.time = time;
    }

    public Post(int idPost, String username, String img, String content, String time) {
        this.idPost = idPost;
        this.username = username;
        this.img = img;
        this.content = content;
        this.time = time;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
