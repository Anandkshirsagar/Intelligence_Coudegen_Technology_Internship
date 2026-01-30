package com.surveyboard.service;

import com.surveyboard.model.User;

public class EmailService {

    public void sendPromotion(User user, String surveyTitle) {
        System.out.println("Email sent to " + user.getEmail()
                + " about survey: " + surveyTitle);
    }
}
