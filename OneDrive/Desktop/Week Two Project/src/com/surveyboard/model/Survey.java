package com.surveyboard.model;

import java.util.List;

public class Survey {

    private String id;
    private String title;
    private List<Question> questions;
    private boolean published;

    public Survey(String id, String title, List<Question> questions) {
        this.id = id;
        this.title = title;
        this.questions = questions;
    }

    public String getId() {
        return id;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void publish() {
        this.published = true;
    }

    public boolean isPublished() {
        return published;
    }

    public String getTitle() {
        return title;
    }
}
