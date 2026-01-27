package com.greenenergy.solarsolutions.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estimator_records")
public class EstimatorRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double monthlyBill;
    private double roofArea;
    private String location;

    private int recommendedKW;
    private double estimatedCost;
    private double monthlySavings;
    private double yearlySavings;

    // getters & setters
    public Long getId() {
        return id;
    }

    public double getMonthlyBill() {
        return monthlyBill;
    }

    public void setMonthlyBill(double monthlyBill) {
        this.monthlyBill = monthlyBill;
    }

    public double getRoofArea() {
        return roofArea;
    }

    public void setRoofArea(double roofArea) {
        this.roofArea = roofArea;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

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
