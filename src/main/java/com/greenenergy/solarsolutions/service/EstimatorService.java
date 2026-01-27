package com.greenenergy.solarsolutions.service;

import com.greenenergy.solarsolutions.dto.EstimatorRequestDTO;
import com.greenenergy.solarsolutions.dto.EstimatorResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class EstimatorService {

    public EstimatorResponseDTO calculateEstimate(EstimatorRequestDTO request) {

        // Simple solar estimation logic
        int recommendedKW = (int) Math.ceil(request.getMonthlyBill() / 1000);
        double estimatedCost = recommendedKW * 55000;
        double monthlySavings = request.getMonthlyBill() * 0.8;
        double yearlySavings = monthlySavings * 12;

        EstimatorResponseDTO response = new EstimatorResponseDTO();
        response.setRecommendedKW(recommendedKW);
        response.setEstimatedCost(estimatedCost);
        response.setMonthlySavings(monthlySavings);
        response.setYearlySavings(yearlySavings);

        return response;
    }
}
