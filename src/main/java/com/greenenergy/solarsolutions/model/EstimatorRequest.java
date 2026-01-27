package com.greenenergy.solarsolutions.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estimator_requests")
public class EstimatorRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double monthlyBill;
    private double roofArea;
    private String location;

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
}
