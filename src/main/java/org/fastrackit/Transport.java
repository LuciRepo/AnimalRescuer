package org.fastrackit;

public class Transport {
    String type;
    String name;
    double speedKmPerHour;
    double pricePerKm;
    public Transport (String name, double pricePerKm){
        this.name=name;
        this.pricePerKm=pricePerKm;
    }
}
