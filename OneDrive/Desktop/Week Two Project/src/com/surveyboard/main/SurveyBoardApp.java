package com.surveyboard.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.surveyboard.model.Question;
import com.surveyboard.model.Response;
import com.surveyboard.model.Survey;
import com.surveyboard.model.User;
import com.surveyboard.repository.ResponseRepository;
import com.surveyboard.repository.SurveyRepository;
import com.surveyboard.repository.impl.InMemoryResponseRepository;
import com.surveyboard.repository.impl.InMemorySurveyRepository;
import com.surveyboard.service.EmailService;
import com.surveyboard.service.ResultService;
import com.surveyboard.service.SurveyService;

public class SurveyBoardApp {

    public static void main(String[] args) {

        SurveyRepository surveyRepo = new InMemorySurveyRepository();
        ResponseRepository responseRepo = new InMemoryResponseRepository();

        SurveyService surveyService = new SurveyService(surveyRepo, responseRepo);

        EmailService emailService = new EmailService();
        ResultService resultService = new ResultService();

        User user = new User("U1", "Anand", "anand@gmail.com", true);

        Question q1 = new Question("Q1", "Rate our service",
                Arrays.asList("Good", "Average", "Bad"));

        Survey survey = new Survey("S1",
                "Customer Feedback Survey",
                Arrays.asList(q1));

        surveyService.createSurvey(survey);
        surveyService.publishSurvey("S1");

        emailService.sendPromotion(user, survey.getTitle());

        Map<String, String> ans = new HashMap<>();
        ans.put("Q1", "Good");

        Response response = new Response("S1", user.getId(), ans);

        surveyService.submitResponse(user, survey, response);

        // Anonymous response
        Response anonymous = new Response("S1", null, ans);

        surveyService.submitResponse(null, survey, anonymous);

        List<Response> live = surveyService.getLiveResponses("S1");

        System.out.println(
                resultService.generateStatistics(live));
    }
}
