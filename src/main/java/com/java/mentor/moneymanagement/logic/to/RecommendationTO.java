package com.java.mentor.moneymanagement.logic.to;

import com.java.mentor.moneymanagement.dataaccess.entity.Category;

import java.util.Objects;

public class RecommendationTO {

    private Long recommendationId;
    private String recommendationDescription;
    private Category recommendationCategory;

    public Long getRecommendationId() {
        return recommendationId;
    }

    public RecommendationTO setRecommendationId(Long recommendationId) {
        this.recommendationId = recommendationId;
        return this;
    }

    public String getRecommendationDescription() {
        return recommendationDescription;
    }

    public RecommendationTO setRecommendationDescription(String recommendationDescription) {
        this.recommendationDescription = recommendationDescription;
        return this;
    }

    public Category getRecommendationCategory() {
        return recommendationCategory;
    }

    public RecommendationTO setRecommendationCategory(Category recommendationCategory) {
        this.recommendationCategory = recommendationCategory;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof RecommendationTO))
            return false;
        RecommendationTO that = (RecommendationTO) o;
        return Objects.equals(recommendationId, that.recommendationId)
                && Objects.equals(recommendationDescription, that.recommendationDescription)
                && Objects.equals(recommendationCategory, that.recommendationCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recommendationId,
                recommendationDescription,
                recommendationCategory);
    }

}
