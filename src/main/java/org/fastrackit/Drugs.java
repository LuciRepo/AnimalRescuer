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

    public Drugs(double quantity, double pricePerKg, double caloriesPerKg, String sideEffects) {
        super(quantity, pricePerKg, caloriesPerKg);
        this.sideEffects = sideEffects;
        if (sideEffects=="null"){
            }
        else
            System.out.println(sideEffects);
    }
}
