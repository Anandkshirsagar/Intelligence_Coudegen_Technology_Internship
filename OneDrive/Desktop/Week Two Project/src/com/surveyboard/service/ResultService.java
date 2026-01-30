package com.surveyboard.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.surveyboard.model.Response;

public class ResultService {

    public Map<String, Map<String, Integer>> generateStatistics(List<Response> responses) {

        Map<String, Map<String, Integer>> stats = new HashMap<>();

        for (Response r : responses) {

            r.getAnswers().forEach((questionId, option) -> {

                stats.putIfAbsent(questionId, new HashMap<>());

                Map<String, Integer> optionCount = stats.get(questionId);

                optionCount.put(option,
                        optionCount.getOrDefault(option, 0) + 1);
            });
        }
        return stats;
    }
}
