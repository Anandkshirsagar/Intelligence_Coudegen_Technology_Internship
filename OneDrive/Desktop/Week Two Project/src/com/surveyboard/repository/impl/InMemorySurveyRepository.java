package com.surveyboard.repository.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.surveyboard.model.Survey;
import com.surveyboard.repository.SurveyRepository;

public class InMemorySurveyRepository implements SurveyRepository {

    private Map<String, Survey> store = new HashMap<>();

    public void save(Survey survey) {
        store.put(survey.getId(), survey);
    }

    public Survey findById(String id) {
        return store.get(id);
    }

    public List<Survey> findAll() {
        return new ArrayList<>(store.values());
    }
}
