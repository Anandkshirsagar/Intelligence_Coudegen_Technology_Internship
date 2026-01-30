package com.surveyboard.model;

import java.util.List;

public class Question {

    private String id;
    private String text;
    private List<String> options;

    public Question(String id, String text, List<String> options) {
        this.id = id;
        this.text = text;
        this.options = options;
    }

    public String getId() {
        return id;
    }

    public List<String> getOptions() {
        return options;
    }

    public String getText() {
        return text;
    }
}
