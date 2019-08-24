package org.fastrackit;

public class Transport {
    private String type;
    private String name;
    private double speedKmPerHour;
    private double pricePerKm;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public double getSpeedKmPerHour() {
        return speedKmPerHour;
    }

    public void setSpeedKmPerHour(double speedKmPerHour) {
        this.speedKmPerHour = speedKmPerHour;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public void setPricePerKm() {
        this.pricePerKm = pricePerKm;
    }

    public Transport (String name, double pricePerKm){
        this.name=name;
        this.pricePerKm=pricePerKm;
    }
}
