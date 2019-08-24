package org.fastrackit;


public class Adopter {
    String name;
    double savings;
    String sex;
    int age;
    String occupation;
    String address;
    double incomePerAnum;
    public Adopter (String name,String occupation,double incomePerAnum){
        this.name=name;
        this.occupation=occupation;
        if (incomePerAnum>360){
            this.incomePerAnum=incomePerAnum;
        }
        else
            System.out.println("We are very sorry but you are uneligible to adopt a dog");
    }
}
