package com.surveyboard.service;

import java.util.List;

import com.surveyboard.model.Response;
import com.surveyboard.model.Survey;
import com.surveyboard.model.User;
import com.surveyboard.repository.ResponseRepository;
import com.surveyboard.repository.SurveyRepository;

public class SurveyService {

    private SurveyRepository surveyRepository;
    private ResponseRepository responseRepository;

    public SurveyService(SurveyRepository surveyRepository,
            ResponseRepository responseRepository) {
        this.surveyRepository = surveyRepository;
        this.responseRepository = responseRepository;
    }

    public void createSurvey(Survey survey) {
        surveyRepository.save(survey);
    }

    public void publishSurvey(String surveyId) {
        Survey survey = surveyRepository.findById(surveyId);
        if (survey != null) {
            survey.publish();
        }
    }

    // Only registered user can submit response
    public void submitResponse(User user, Survey survey, Response response) {

        if (!survey.isPublished()) {
            throw new RuntimeException("Survey not published");
        }

        if (user != null && !user.isRegistered()) {
            throw new RuntimeException("Only registered users can submit responses");
        }

        responseRepository.save(response);
    }

    // real-time data access
    public List<Response> getLiveResponses(String surveyId) {
        return responseRepository.findBySurveyId(surveyId);
    }
}
