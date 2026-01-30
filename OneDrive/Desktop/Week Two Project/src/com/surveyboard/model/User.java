package com.surveyboard.model;

public class User {

    private String id;
    private String name;
    private String email;
    private boolean registered;

    public User(String id, String name, String email, boolean registered) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.registered = registered;
    }

    public boolean isRegistered() {
        return registered;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }
}
