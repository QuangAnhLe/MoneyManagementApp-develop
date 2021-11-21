package com.java.mentor.moneymanagement.service.rest;

import com.java.mentor.moneymanagement.logic.to.RecommendationTO;

import java.util.List;

public interface RecommendationController {

    List<RecommendationTO> getRecommendations();
    RecommendationTO createRecommendation(RecommendationTO recommendationTO);
    RecommendationTO updateRecommendation(RecommendationTO recommendationTO, Long RecommendationId);
    void deleteRecommendation(Long recommendationId);
}
