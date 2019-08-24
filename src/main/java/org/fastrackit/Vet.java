package org.fastrackit;

public class Vet extends Adopter {
    // String name;
    private String specialization;
    //String sex;
    // int age;
    private double feePerHour;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization() {
        this.specialization = specialization;
    }

    public double getFeePerHour() {
        return feePerHour;
    }

    public void setFeePerHour() {
        this.feePerHour = feePerHour;
    }

    //String address;
    // double incomePerAnum;
    public Vet(String name, String specialization, double incomePerAnum, double feePerHour) {
                super(name, specialization, incomePerAnum);
                this.feePerHour = feePerHour;
    }

    /*public Vet(String name, String occupation, double incomePerAnum, double feePerHour) {
        super(name, occupation, incomePerAnum);
        this.feePerHour=feePerHour;*/
}
