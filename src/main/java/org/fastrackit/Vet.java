package org.fastrackit;

public class Vet extends Adopter {
    // String name;
    String specialization;
    //String sex;
    // int age;
    double feePerHour;

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
