package org.fastrackit;


public class Adopter {
    private String name;
    private double savings;
    private String sex;
    private int age;
    private String occupation;
    private String address;
    private double incomePerAnum;
    private String dogName;
    private String foodName;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings() {
        this.savings = savings;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String male) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int i) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation() {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String nearby_oradeaville) {
        this.address = address;
    }

    public double getIncomePerAnum() {
        return incomePerAnum;
    }

    public void setIncomePerAnum() {
        this.incomePerAnum = incomePerAnum;
    }

    public Adopter(String name, String occupation, double incomePerAnum) {
        this.name = name;
        this.occupation = occupation;
        if (incomePerAnum > 360) {
            this.incomePerAnum = incomePerAnum;
        } else
            System.out.println("We are very sorry but you are uneligible to adopt a dog");
    }

    public void feedAnimal(String dogName, String foodName, int hungerLevel,int moodLevel) {
        this.dogName = dogName;
        this.foodName = foodName;
        //hungerLevel--;
        //hungerLevel = Math.max(hungerLevel, 1);
        if(foodName=="Meat"){
            System.out.println("Mood level is at "+ moodLevel++);
        }

        System.out.println(this.name + " just gave some " + foodName + " to " + dogName + " and its level of hunger is at " + hungerLevel);
    }

}

