package org.fastrackit;


//aici se proiecteaza
public class Animal {
    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int moodLevel;
    private String foodPreference;
    private String recreationPreference;
    private String specie;
    private String race;
    private double weight;
    private String colour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFoodPreference() {
        return foodPreference;
    }

    public void setFoodPreference(String foodPreference) {
        this.foodPreference = foodPreference;
    }

    public String getRecreationPreference() {
        return recreationPreference;
    }

    public void setRecreationPreference(String recreationPreference) {
        this.recreationPreference = recreationPreference;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel() {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel() {
        this.hungerLevel = hungerLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel() {
        this.moodLevel = moodLevel;
    }

    public Animal(int healthLevel, int hungerLevel, int moodLevel) {
        if (healthLevel > 10) {
            this.healthLevel = Math.min(10, healthLevel);
        } else
            this.healthLevel = Math.max(1, healthLevel);
        if (hungerLevel > 10) {
            this.hungerLevel = Math.min(10, hungerLevel);
        } else
            this.hungerLevel = Math.max(1, hungerLevel);
        if (moodLevel > 10) {
            this.moodLevel = Math.min(10, moodLevel);
        } else
            this.moodLevel = Math.max(1, moodLevel);

    }

    public Animal(String name, int age, int healthLevel, int hungerLevel, int moodLevel, String foodPreference, String recreationPreference, String specie, String race, double weight, String colour) {
        this.name = name;
        this.age = age;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.moodLevel = moodLevel;
        this.foodPreference = foodPreference;
        this.recreationPreference = recreationPreference;
        this.specie = specie;
        this.race = race;
        this.weight = weight;
        this.colour = colour;
    }

    public int animalMoodStatus(int mood) {
        int moodLevel = mood;
        //moodLevel = getMoodLevel();
        mood+=2;

        // System.out.println(getName() + " the " + getSpecie() + " is moaning");
        //System.out.println("Mood level is: " + moodLevel);
        // return moodLevel;
        return mood;
    }
}

