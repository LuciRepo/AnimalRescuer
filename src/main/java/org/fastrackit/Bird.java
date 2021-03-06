package org.fastrackit;

public class Bird extends Animal {
    private int maxFlightAltitude;
    //private Animal animal2=new Animal(12,12,12); daca vrem sa facem compozitie in loc de mostenire
    public int getMaxFlightAltitude() {
        return maxFlightAltitude;
    }

    public void setMaxFlightAltitude(int maxFlightAltitude) {
        this.maxFlightAltitude = maxFlightAltitude;
    }

    /*@Override
    public void animalMoodStatus() {
        //super.animalMoodStatus();
        int moodLevel = 0;
        moodLevel=getMoodLevel();
        if (moodLevel>5) {
          // System.out.println(getName()+" the "+getSpecie() + " is happily "+ getRecreationPreference());
        }
        else{}
         //  System.out.println(getName()+" the "+getSpecie() +" is sad and so quiet");
        //System.out.println("Mood level is: "+ moodLevel);
    }*/

    public Bird(int healthLevel, int hungerLevel, int moodLevel, int maxFlightAltitude) {
        super(healthLevel, hungerLevel, moodLevel);
        this.maxFlightAltitude = maxFlightAltitude;
    }
    public Bird( String name, int age, int healthLevel, int hungerLevel, int moodLevel, String foodPreference, String recreationPreference,String specie, String race,double weight, String colour, int maxFlightAltitude){
        super(name, age, healthLevel, hungerLevel, moodLevel, foodPreference, recreationPreference, specie, race, weight, colour);
        this.maxFlightAltitude=maxFlightAltitude;
    }
}
