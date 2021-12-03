package com.java.mentor.moneymanagement.dataaccess.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long recommendationId;
    private String recommendationDescription;
    private Category recommendationCategory;

    public Long getRecommendationId() {
        return recommendationId;
    }

    public void setRecommendationId(Long recommendationId) {
        this.recommendationId = recommendationId;
    }

    public String getRecommendationDescription() {
        return recommendationDescription;
    }

    public void setRecommendationDescription(String recommendationDescription) {
        this.recommendationDescription = recommendationDescription;
    }

    public Category getRecommendationCategory() {
        return recommendationCategory;
    }

    public void setRecommendationCategory(Category recommendationCategory) {
        this.recommendationCategory = recommendationCategory;
    }
}
