package com.greenenergy.solarsolutions.dto;

public class EstimatorRequestDTO {

    private double monthlyBill;
    private double roofArea;
    private String location;

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
