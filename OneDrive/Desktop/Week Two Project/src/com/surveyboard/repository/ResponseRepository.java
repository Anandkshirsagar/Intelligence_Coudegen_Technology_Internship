package com.surveyboard.repository;

import java.util.List;

import com.surveyboard.model.Response;

public interface ResponseRepository {

    void save(Response response);

    List<Response> findBySurveyId(String surveyId);
}
