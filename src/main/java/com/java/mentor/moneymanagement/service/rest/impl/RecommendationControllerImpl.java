package com.java.mentor.moneymanagement.service.rest.impl;

import com.java.mentor.moneymanagement.logic.RecommendationService;
import com.java.mentor.moneymanagement.logic.to.RecommendationTO;
import com.java.mentor.moneymanagement.service.rest.RecommendationController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecommendationControllerImpl implements RecommendationController {

    private RecommendationService recommendationService;

    public RecommendationControllerImpl(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @GetMapping("/recommendation")
    public List<RecommendationTO> getRecommendations() {
        return recommendationService.getRecommendations();
    }

    @PostMapping("/recommendation")
    public RecommendationTO createRecommendation(@RequestBody RecommendationTO recommendationTO) {
        return recommendationService.createRecommendation(recommendationTO);
    }

    @PutMapping("/recommendation/{id}")
    public RecommendationTO updateRecommendation(@RequestBody RecommendationTO recommendationTO,@PathVariable Long id) {
        return recommendationService.updateRecommendation(recommendationTO, id);
    }

    @DeleteMapping("/recommendation/{id}")
    public void deleteRecommendation(@PathVariable Long id) {
        recommendationService.deleteRecommendation(id);
    }
}
