package com.java.mentor.moneymanagement.logic;

import com.java.mentor.moneymanagement.logic.to.RecommendationTO;

import java.util.List;

public interface RecommendationService {
    List<RecommendationTO> getRecommendations();
    RecommendationTO createRecommendation(RecommendationTO recommendationTO);
    RecommendationTO updateRecommendation(RecommendationTO recommendationTO, Long RecommendationId) throws IllegalStateException;
    void deleteRecommendation(Long recommendationId);
}
