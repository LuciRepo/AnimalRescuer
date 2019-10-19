package org.fastrackit;

public class Insect extends Bird {
    boolean poisonous;

    //private Bird bird2=new Bird(1,3,5,500); daca vrem sa folosim compozitie in loc de mostenire
    public boolean isPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    public Insect(int healthLevel, int hungerLevel, int moodLevel, int maxFlightAltitude, boolean poisonous) {
        super(healthLevel, hungerLevel, moodLevel, maxFlightAltitude);
        this.poisonous = poisonous;
    }
    public Insect(String name, int age, int healthLevel, int hungerLevel, int moodLevel, String foodPreference, String recreationPreference,String specie, String race,double weight, String colour,int maxFlightAltitude, Boolean poisonous){
        super(name,age,healthLevel,hungerLevel,moodLevel,foodPreference,recreationPreference,specie,race,weight,colour,maxFlightAltitude);
        this.poisonous=poisonous;
    }

    @Override
    public void showAnimalMoodStatus() {
        //super.showAnimalMoodStatus();
        int moodLevel = 0;
        moodLevel = getMoodLevel();
        if (moodLevel > 5) {
            System.out.println(getName() + " the " + getSpecie() + " is happily " + getRecreationPreference());
        } else
            System.out.println(getName() + " the " + getSpecie() + " is flying down with the wind");
        System.out.println("Mood level is: " + moodLevel);
    }
}
