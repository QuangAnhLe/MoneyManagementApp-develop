package com.java.mentor.moneymanagement.logic.impl;

import com.java.mentor.moneymanagement.dataaccess.RecommendationRepository;
import com.java.mentor.moneymanagement.dataaccess.entity.Recommendation;
import com.java.mentor.moneymanagement.logic.RecommendationService;
import com.java.mentor.moneymanagement.logic.mapper.RecommendationMapper;
import com.java.mentor.moneymanagement.logic.to.RecommendationTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecommendationServiceImpl implements RecommendationService {

    private RecommendationRepository recommendationRepository;

    public RecommendationServiceImpl(RecommendationRepository recommendationRepository) {
        this.recommendationRepository = recommendationRepository;
    }

    @Override
    public List<RecommendationTO> getRecommendations() {
        return recommendationRepository.findAll()
                .stream()
                .map(RecommendationMapper::mapRecommendationEntitytoTO)
                .collect(Collectors.toList());
    }

    @Override
    public RecommendationTO createRecommendation(RecommendationTO recommendationTO) {
        Recommendation entity = RecommendationMapper.mapRecommendationTOtoEntity(recommendationTO);
        Recommendation savedRecommendation = recommendationRepository.save(entity);
        return RecommendationMapper.mapRecommendationEntitytoTO(savedRecommendation);
    }

    @Override
    public RecommendationTO updateRecommendation(RecommendationTO recommendationTO, Long RecommendationId) {
        Recommendation updatedRecommendation = recommendationRepository.findById(RecommendationId)
                .map(recommendation -> {
                    recommendation.setRecommendationCategory(recommendationTO.getRecommendationCategory());
                    recommendation.setRecommendationDescription(recommendationTO.getRecommendationDescription());
                    return recommendationRepository.save(recommendation);
                })
                .orElseThrow(()->{
                    throw new IllegalStateException("no find recommendation ID");
        });

        return RecommendationMapper.mapRecommendationEntitytoTO(updatedRecommendation);
    }

    @Override
    public void deleteRecommendation(Long RecommendationId) {
        recommendationRepository.deleteById(RecommendationId);
    }
}

