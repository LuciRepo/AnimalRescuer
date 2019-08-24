package org.fastrackit;

public class LeisureActivities {
    private String name;
    private int durationMinutes;
    private int numberActivitiesPerDay;
    private String place;
    private double caloriesBurnt;
    private int satisfactionLeisure;
    private String adopterName;
    private String animalName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes() {
        this.durationMinutes = durationMinutes;
    }
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getCaloriesBurnt() {
        return caloriesBurnt;
    }

    public void setCaloriesBurnt() {
        this.caloriesBurnt = caloriesBurnt;
    }

    public int getSatisfactionLeisure() {
        return satisfactionLeisure;
    }

    public int getNumberActivitiesPerDay() {
        return numberActivitiesPerDay;
    }

    public void setNumberActivitiesPerDay() {
        this.numberActivitiesPerDay = numberActivitiesPerDay;
    }

    public void setSatisfactionLeisure() {
        this.satisfactionLeisure = satisfactionLeisure;
    }

    public LeisureActivities (int durationMinutes, int numberActivitiesPerDay, int caloriesBurnt, int satisfactionLeisure){
        this.durationMinutes=durationMinutes;
        this.numberActivitiesPerDay=numberActivitiesPerDay;
        this.caloriesBurnt=caloriesBurnt;
        this.satisfactionLeisure=satisfactionLeisure;
    }
    public void playTimeAnimal (String adopterName,String animalName){
        this.adopterName=adopterName;
        this.animalName=animalName;
        System.out.println(adopterName+" is having fun with "+animalName+" for "+this.durationMinutes+" minutes of "+this.name);
    }
}
