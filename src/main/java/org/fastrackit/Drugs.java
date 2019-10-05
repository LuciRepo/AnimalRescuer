package org.fastrackit;

import java.util.Date;

public class Drugs extends Foodforanimals {
    //String name;
    //String brand;
    private double pricePerDose;
    private String sideEffects;

    public double getPricePerDose() {
        return pricePerDose;
    }

    public void setPricePerDose(double pricePerDose) {
        this.pricePerDose = pricePerDose;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects() {
        this.sideEffects = sideEffects;
    }

    public Drugs(String name,double quantity, double pricePerKg, double caloriesPerKg, String sideEffects) {
        super(name, quantity, pricePerKg, caloriesPerKg);
        this.sideEffects = sideEffects;
        if (sideEffects == "null") {
            System.out.println("Efecte secundare: " + "Nu e cazul");
        } else
            System.out.println("Efecte secundare " + sideEffects);
    }
}
