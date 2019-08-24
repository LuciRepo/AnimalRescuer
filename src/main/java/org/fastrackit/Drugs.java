package org.fastrackit;

import java.util.Date;

public class Drugs extends Foodforanimals {
    //String name;
    //String brand;
    double pricePerDose;
    String sideEffects;

    public Drugs(double quantity, double pricePerKg, double caloriesPerKg, String sideEffects) {
        super(quantity, pricePerKg, caloriesPerKg);
        this.sideEffects = sideEffects;
        if (sideEffects=="null"){
            }
        else
            System.out.println(sideEffects);
    }
}
