package org.fastrackit;

import java.util.ArrayList;

public class Game {
    public String name;
    public String adopter;
    public String dog;
    public String vet;
    public int numberOfFoods;
    public int numberOfActivities = 4;

    private ArrayList<Foodforanimals> avalilableFood = new ArrayList<Foodforanimals>(numberOfFoods);
    private LeisureActivities[] availableActivities = new LeisureActivities[numberOfActivities];

    public ArrayList<Foodforanimals> getAvalilableFood() {
        return avalilableFood;
    }

    public void setAvalilableFood(ArrayList<Foodforanimals> avalilableFood) {
        this.avalilableFood = avalilableFood;
    }

    public LeisureActivities[] getAvailableActivities() {
        return availableActivities;
    }

    public void setAvailableActivities(LeisureActivities[] availableActivities) {
        this.availableActivities = availableActivities;
    }


    private void initFood() {
        Foodforanimals foodOne = new Foodforanimals("Red meat", 21, 34, 289);
        Foodforanimals foodTwo = new Foodforanimals("White meat", 12, 45, 234);
        Foodforanimals foodThree = new Foodforanimals("Milk", 28, 12, 123);
        Foodforanimals foodFour = new Foodforanimals("Biscuits", 89, 29, 78);
        avalilableFood.add(0, foodOne);
        avalilableFood.add(1, foodTwo);
        avalilableFood.add(2, foodThree);
        avalilableFood.add(3, foodFour);
    }

    private void intActivities() {
        LeisureActivities leisureOne = new LeisureActivities("Running", 12, 2, 230, 45);
        LeisureActivities leisureTwo = new LeisureActivities("Jumping", 4, 6, 34, 14);
        LeisureActivities leisureThree = new LeisureActivities("Rolling left", 1, 23, 210, 45);
        LeisureActivities leisureFour = new LeisureActivities("Rolling right", 1, 45, 65, 34);

        availableActivities[0] = leisureOne;
        availableActivities[1] = leisureTwo;
        availableActivities[2] = leisureThree;
        availableActivities[3] = leisureFour;
    }

    private void showAvailableFood() {
        int i = 0;
        System.out.println("The list of available food contains: ");
        for (Foodforanimals showFoodList : avalilableFood) {
            System.out.println(getAvalilableFood().get(i).getName());
            i++;
        }
    }

    private void showAvailableActivities() {
        System.out.println("The list of available activities contains: ");
        for (int i = 0; i < numberOfActivities; i++) {
            System.out.println(availableActivities[i].getName());
        }
    }

    public Game() {
    }

    public void start() {
        initFood();
        intActivities();
        showAvailableFood();
        showAvailableActivities();
    }

    public Game(String nameGame) {
        this.name = nameGame;


    }
}
