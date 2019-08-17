package org.fastrackit;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Optional;

//aici se construieste
public class App {
    public static void main(String arg[]){
    Animal dog= new Animal();
        dog.age=2;
        dog.healthLevel=7;
        dog.hungerLevel=6;
        dog.moodLevel=3;
        dog.weight=12;
        dog.name="Spike";
        dog.foodPreference="Meat";
        dog.recreationPreference="Chasing cats";
        dog.specie="Dog";
        dog.race="Bulldog";
        dog.colour="Grey-brownish";
        System.out.println("Dog health level is "+dog.healthLevel);
   Adopter dogOwner= new Adopter();
        dogOwner.name="Toby";
        dogOwner.savings=120.40;
        dogOwner.sex="Male";
        dogOwner.age=29;
        dogOwner.occupation="Soft Dev";
        dogOwner.address="Downtown Oradeaville";
        dogOwner.incomePerAnum=5000;
        System.out.println("Adopter's name is "+dogOwner.name);

   Foodforanimals animalFood= new Foodforanimals();
        animalFood.name="Juicy meat cubs";
        animalFood.pricePerKg=1.4;
        animalFood.quantity=2;
        animalFood.expirationDate= LocalDateTime.of(2020, 12,30,0,0,0);;
        animalFood.manufacturingDate= new java.util.Date(2019, Calendar.JANUARY,15,0,0,0);
        animalFood.quantiyAvailable=200;
        animalFood.brand="Meat&Eat";
        animalFood.contentProteinPerKg=200;
        animalFood.contentFatPerKg=120;
        animalFood.contentSweetPerKg=20;
        animalFood.caloriesPerKg=500;
        System.out.println("Expiration date is "+animalFood.expirationDate);
        System.out.println("Manufacturing date is "+animalFood.manufacturingDate);

   LeisureActivities theHappyTime= new LeisureActivities();
        theHappyTime.name="A walk in the park";
        theHappyTime.durationMinutes= 35;
        theHappyTime.nunmerActivitiesPerDay=2;
        theHappyTime.place="Central Park";
        theHappyTime.caloriesBurnt=59.5;
        theHappyTime.satisfactionLeisure=2;
        System.out.println("Today "+dog.name+" burnt "+theHappyTime.caloriesBurnt+" calories");

   Vet theVet= new Vet();
        theVet.name = "Veta";
        theVet.specialization= "Domestic animals";
        theVet.sex = "Female";
        theVet.age = 43;
        theVet.feePerHour=14;
        theVet.address="City outskirts";
        theVet.incomePerAnum=8000;
        System.out.println("Vet's name is "+theVet.name);

   Game animalFun=new Game();
        animalFun.adopter="I am going to buy 2 kg of "+ dog.foodPreference +" for "+dog.name;
        animalFun.dog= dog.name+ " has been "+ dog.recreationPreference+" for "+theHappyTime.durationMinutes+" minutes now";
        animalFun.vet=theVet.name+" visits "+dog.name+ "for monthly consultation";
        System.out.println(animalFun.adopter);
        System.out.println(animalFun.dog);
        System.out.println(animalFun.vet);
    }
   }
