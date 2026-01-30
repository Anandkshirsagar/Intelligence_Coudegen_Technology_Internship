package com.surveyboard.repository;

import java.util.List;

import com.surveyboard.model.Survey;

public interface SurveyRepository {

    void save(Survey survey);

    Survey findById(String id);

    List<Survey> findAll();
}
