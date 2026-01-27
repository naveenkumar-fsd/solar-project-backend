package com.greenenergy.solarsolutions.dto;

public class EstimatorResponseDTO {

    private int recommendedKW;
    private double estimatedCost;
    private double monthlySavings;
    private double yearlySavings;

    public int getRecommendedKW() {
        return recommendedKW;
    }

    public void setRecommendedKW(int recommendedKW) {
        this.recommendedKW = recommendedKW;
    }

    public double getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(double estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public double getMonthlySavings() {
        return monthlySavings;
    }

    public void setMonthlySavings(double monthlySavings) {
        this.monthlySavings = monthlySavings;
    }

    public double getYearlySavings() {
        return yearlySavings;
    }

    public void setYearlySavings(double yearlySavings) {
        this.yearlySavings = yearlySavings;
    }
}
