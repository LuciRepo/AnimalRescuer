package org.fastrackit;

import java.util.Date;
import java.util.Optional;

//aici se construieste
public class App {
    public static void main(String arg[]) {
        Animal dog = new Animal(-33, 8, 17);
        dog.age = 2;
        // dog.healthLevel=Math.min(10,dog.healthLevel);
        // dog.hungerLevel=6;
        // dog.moodLevel=3;
        dog.weight = 12;
        dog.name = "Spike";
        dog.foodPreference = "Meat";
        dog.recreationPreference = "Chasing cats";
        dog.specie = "Dog";
        dog.race = "Bulldog";
        dog.colour = "Grey-brownish";


        System.out.println("Dog health level is " + dog.healthLevel + ", hunger level is " + dog.hungerLevel + ", mood level is " + dog.moodLevel);
        Adopter dogOwner = new Adopter("Toby", "Soft Dev", 230);
        //dogOwner.name="Toby";
        dogOwner.savings = 120.40;
        dogOwner.sex = "Male";
        dogOwner.age = 29;
        //dogOwner.occupation="Soft Dev";
        dogOwner.address = "Downtown Oradeaville";
        // dogOwner.incomePerAnum=5000;
        System.out.println("Adopter's name is " + dogOwner.name);

        Foodforanimals animalFood = new Foodforanimals(127, 14, 230);
        animalFood.name = "Juicy meat cubs";
        //animalFood.pricePerKg=1.4;
        //animalFood.quantity=2;
        animalFood.expirationDate= new Date(2020, 12,30,0,0,0);
        animalFood.manufacturingDate = new Date(2019, 12, 15, 0, 0, 0);
        animalFood.quantiyAvailable = 200;
        animalFood.brand = "Meat&Eat";
        animalFood.contentProteinPerKg = 200;
        animalFood.contentFatPerKg = 120;
        animalFood.contentSweetPerKg = 20;
        //animalFood.caloriesPerKg=500;
        System.out.println("Expiration date is " + animalFood.expirationDate);
        System.out.println("Manufacturing date is " + animalFood.manufacturingDate);

        LeisureActivities theHappyTime = new LeisureActivities(45,3,300,3);
        theHappyTime.name = "A walk in the park";
        //theHappyTime.durationMinutes = 35;
        //theHappyTime.nunmerActivitiesPerDay = 2;
        theHappyTime.place = "Central Park";
        //theHappyTime.caloriesBurnt = 59.5;
        //theHappyTime.satisfactionLeisure = 2;
        System.out.println("Today " + dog.name + " burnt " + theHappyTime.caloriesBurnt + " calories");

        Vet theVet = new Vet("Velvet", "Domestic animals", 8000, 14);
        //theVet.name = "Veta";
        //theVet.specialization= "Domestic animals";
        theVet.sex = "Female";
        theVet.age = 43;
        // theVet.feePerHour=14;
        theVet.address = "City outskirts";
        theVet.incomePerAnum = 8000;
        System.out.println("Vet's name is " + theVet.name);

        Game animalFun = new Game();
        animalFun.adopter = "I am going to buy 2 kg of " + dog.foodPreference + " for " + dog.name;
        animalFun.dog = dog.name + " has been " + dog.recreationPreference + " for " + theHappyTime.durationMinutes + " minutes now";
        animalFun.vet = theVet.name + " visits " + dog.name + "for monthly consultation";
        System.out.println(animalFun.adopter);
        System.out.println(animalFun.dog);
        System.out.println(animalFun.vet);

        Shelter tempShelter = new Shelter("Grivei","Oradeaville Nufarul",1900);
        //tempShelter.name = "Grivei";
       // tempShelter.address = "Oradeaville outskirts";
       // tempShelter.sizeSm = 10000;
        System.out.println(dog.name + " was adoptet from animal shelter " + tempShelter.name + " located in " + tempShelter.address);

        Drugs animalDrugs = new Drugs(2020, 132, 7,  "Some but harmless");
        animalDrugs.name = "Vitamins and food supliments";
        animalDrugs.brand = "Vitanimalys";
        animalDrugs.pricePerDose = 20;
        System.out.println(dogOwner.name + " buys " + animalDrugs.brand + " for " + dog.name);

        Store animalStore = new Store("Pet Store","Oradeaville south part",1100,"Peter");
        //animalStore.name = "Pet Store";
        //animalStore.adress = " Oradeaville south part";
        //animalStore.manager = "Peter";
        System.out.println(animalDrugs.brand + " costs " + animalDrugs.pricePerDose + " $ at " + animalStore.manager + "'s " + animalStore.name);

        Transport animalTransport = new Transport("Uber",1.5);
        animalTransport.type = "Road";
        //animalTransport.name = "Taxi";
        animalTransport.speedKmPerHour = 45.5;
        //animalTransport.pricePerKm = 1.2;
        System.out.println(theVet.name + " uses " + animalTransport.name + " to visit " + dog.name);
    }
}
