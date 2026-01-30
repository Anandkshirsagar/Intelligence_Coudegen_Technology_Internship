package com.surveyboard.model;

import java.util.Map;

public class Response {

    private String surveyId;
    private String userId; // null for anonymous
    private Map<String, String> answers;

    public Response(String surveyId, String userId, Map<String, String> answers) {
        this.surveyId = surveyId;
        this.userId = userId;
        this.answers = answers;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public Map<String, String> getAnswers() {
        return answers;
    }
}
