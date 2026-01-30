package com.surveyboard.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.surveyboard.model.Response;
import com.surveyboard.repository.ResponseRepository;

public class InMemoryResponseRepository implements ResponseRepository {

    private List<Response> responses = new ArrayList<>();

    public void save(Response response) {
        responses.add(response);
    }

    public List<Response> findBySurveyId(String surveyId) {
        return responses.stream()
                .filter(r -> r.getSurveyId().equals(surveyId))
                .collect(Collectors.toList());
    }
}
