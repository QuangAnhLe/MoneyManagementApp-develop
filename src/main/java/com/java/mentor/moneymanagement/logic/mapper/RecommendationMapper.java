package com.java.mentor.moneymanagement.logic.mapper;

import com.java.mentor.moneymanagement.dataaccess.entity.Input;
import com.java.mentor.moneymanagement.dataaccess.entity.Recommendation;
import com.java.mentor.moneymanagement.logic.to.InputTO;
import com.java.mentor.moneymanagement.logic.to.RecommendationTO;

public class RecommendationMapper {

    public static RecommendationTO mapRecommendationEntitytoTO(Recommendation recommendation){
        return new RecommendationTO()
                .setRecommendationId(recommendation.getRecommendationId())
                .setRecommendationDescription(recommendation.getRecommendationDescription())
                .setRecommendationCategory(recommendation.getRecommendationCategory());
    }
    public static Recommendation mapRecommendationTOtoEntity(RecommendationTO recommendationto){
        Recommendation entity = new Recommendation();
        entity.setRecommendationId(recommendationto.getRecommendationId());
        entity.setRecommendationDescription(recommendationto.getRecommendationDescription());
        entity.setRecommendationCategory(recommendationto.getRecommendationCategory());
        return entity;
    }

}
