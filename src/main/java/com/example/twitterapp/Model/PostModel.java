package com.example.twitterapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")

public class PostModel {

    @Id
    @GeneratedValue
    private int id;
    private String posted_date;
    private int user_id;
    private String post;

    public PostModel() {
    }

    public PostModel(int id, String posted_date, int user_id, String post) {
        this.id = id;
        this.posted_date = posted_date;
        this.user_id = user_id;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosted_date() {
        return posted_date;
    }

    public void setPosted_date(String posted_date) {
        this.posted_date = posted_date;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
