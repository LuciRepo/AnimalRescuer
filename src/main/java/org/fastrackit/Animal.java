package org.fastrackit;

import org.mortbay.io.nio.SelectorManager;

import static java.lang.System.*;

//aici se proiecteaza
public class Animal {
    String name;
    int age;
    int healthLevel;
    int hungerLevel;
    int moodLevel;
    String foodPreference;
    String recreationPreference;
    String specie;
    String race;
    double weight;
    String colour;

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public Animal(int healthLevel, int hungerLevel, int moodLevel) {
        if (healthLevel >10) {
            this.healthLevel=Math.min(10,healthLevel);
        }
        else
            this.healthLevel=Math.max(1,healthLevel);
        if (hungerLevel >10) {
            this.hungerLevel=Math.min(10,hungerLevel);
        }
        else
            this.hungerLevel=Math.max(1,hungerLevel);
        if (moodLevel >10) {
            this.moodLevel=Math.min(10,moodLevel);
        }
        else
            this.moodLevel=Math.max(1,moodLevel);

    }
}

