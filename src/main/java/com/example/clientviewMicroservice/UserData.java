package com.example.clientviewMicroservice;

import java.util.List;

public class UserData {
    long id;
    String name;
    String email;

    List<FeedbackData> feedbackData;

    public UserData(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public UserData() {}

    public long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public List<FeedbackData> getFeedbackData() { return feedbackData; }
}