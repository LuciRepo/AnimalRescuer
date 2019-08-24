package org.fastrackit;

public class LeisureActivities {
    String name;
    int durationMinutes;
    int nunmerActivitiesPerDay;
    String place;
    double caloriesBurnt;
    int satisfactionLeisure;

    public LeisureActivities (int durationMinutes,int nunmerActivitiesPerDay,int caloriesBurnt, int satisfactionLeisure){
        this.durationMinutes=durationMinutes;
        this.nunmerActivitiesPerDay=nunmerActivitiesPerDay;
        this.caloriesBurnt=caloriesBurnt;
        this.satisfactionLeisure=satisfactionLeisure;
    }

}
