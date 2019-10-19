package org.fastrackit;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

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

    private void initActivities() {
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
        initActivities();
        // showAvailableFood();
        showAvailableActivities();
    }

    public Game(String nameGame) {
        this.name = nameGame;
    }

    public void initAnimal() {
        System.out.println("Alegeti un animal de companie");
        Scanner in = new Scanner(System.in);
        String animalAles = in.nextLine();
        if ((animalAles.equalsIgnoreCase("Bird"))) {
            Animal bird = new Bird("Birdy", 2, 8, 4, 3, "Seeds", "Singing", "Parrot", "Imperial", 10, "Yellow", 100);

        } else {
            if (animalAles.equalsIgnoreCase("Insect")) {
                Animal insect = new Insect("Butter", 1, 3, 4, 5, "dust", "flying", "Butterfly", "common", 0.2, "Blue", 10, Boolean.FALSE);
                //   System.out.println("Ok");
            } else {
                System.out.println("Puteti alege doar Bird sau Insect");
            }
        }
    }

    private void initAdopter() {

        System.out.println("Introduceti numele adoptatorului");
        String name = null;
        Scanner in = new Scanner(System.in);
        try {
            name = in.next();
        } catch (Exception incorectName) {
            System.out.println("Numele este incorect"); // de gasit o conditie de a nu se accepta decat litere la citire numelui
            initAdopter();
        }
        Adopter rescuer = new Adopter(name, "Medic", 1200);
        System.out.println("Numele adoptatorului este " + rescuer.getName());
    }

    private void requirefeeding() {
        System.out.println("Feed your animal");
        showAvailableFood();
        System.out.println("Would you like to add a diffrent food?");
        Scanner in = new Scanner(System.in);
        String answear = in.nextLine();
        if (answear.equalsIgnoreCase("yes")) {
            System.out.println("Food name: ");
            String name = in.nextLine();
            System.out.println("Quantity");
            double quantity = in.nextDouble();
            System.out.println("pricePerKg");
            double pricePerKg = in.nextDouble();
            System.out.println("CaloriersPerKg");
            double caloriesPerKg = in.nextDouble();
            Foodforanimals foodOfChoice = new Foodforanimals(name, quantity, pricePerKg, caloriesPerKg);
            //System.out.println(foodOfChoice.getName());
        }
    }

    private void requireActivity() {
        System.out.println("Play with your animal");
        showAvailableActivities();
        System.out.println("Would you like to add a different leisure activity?");
        Scanner in = new Scanner(System.in);
        String answear = in.nextLine();
        if (answear.equalsIgnoreCase("yes")) {
            System.out.println("Activity name:");
            String name = in.nextLine();
            System.out.println("Time frame");
            int durationInMinutes = in.nextInt();
            System.out.println("NumberActivitiesPerDay");
            int numberActivitiesPerDay = in.nextInt();
            System.out.println("Calories burnt");
            int caloriesBurnt = in.nextInt();
            System.out.println("SatisfactionLeisure");
            int satisfactionLeisure = in.nextInt();
            LeisureActivities activityOfChoice = new LeisureActivities(name, durationInMinutes, numberActivitiesPerDay, caloriesBurnt, satisfactionLeisure);
           // System.out.println(activityOfChoice.getName());
        }
    }

    public void newStart() {
        initAnimal();
        initAdopter();
        initFood();
        initActivities();
        requirefeeding();
        requireActivity();
    }
}



