package org.fastrackit;

import java.util.Date;

//aici se construieste
public class App {
    public static void main(String[] arg) {
        Animal dog = new Animal(13, 0, 7);
        dog.setHealthLevel();
        dog.setHungerLevel();
        dog.setMoodLevel();
        //dog.name="Spyke";
        dog.setName("Spyke");
        // dog.healthLevel=Math.min(10,dog.healthLevel);
        // dog.hungerLevel=6;
        // dog.moodLevel=3;
        //dog.weight = 12;
        dog.setWeight(13);
        //dog.foodPreference = "Meat";
        dog.setFoodPreference("Meat");
        //dog.recreationPreference = "Chasing cats";
        dog.setRecreationPreference("Chasing cats");
        //dog.specie = "Dog";
        dog.setSpecie("Dog");
        //dog.race = "Bulldog";
        dog.setRace("Bulldog");
        //dog.colour = "Grey-brownish";
        dog.setColour("Grey");
        dog.showAnimalMoodStatus();

        System.out.println("Dog health level is " + dog.getHealthLevel()/*healthLevel*/ + ", hunger level is " + dog.getHungerLevel()/*hungerLevel*/ + ", mood level is " + dog.getMoodLevel()/*moodLevel*/);
        Adopter dogOwner = new Adopter("Toby", "Soft Dev", 230);
        dogOwner.setName();
        dogOwner.setOccupation();
        dogOwner.setIncomePerAnum();
        //dogOwner.name="Toby";
        //dogOwner.savings = 120.40;
        dogOwner.setSavings();
        //dogOwner.sex = "Male";
        dogOwner.setSex("Male");
        //dogOwner.age = 29;
        dogOwner.setAge(34);
        //dogOwner.occupation="Soft Dev";
        //dogOwner.address = "Downtown Oradeaville";
        dogOwner.setAddress("Nearby Oradeaville");
        // dogOwner.incomePerAnum=5000;
        System.out.println("Adopter's name is " + dogOwner.getName()/*name*/);

        Foodforanimals animalFood = new Foodforanimals(127, 14, 230);
        animalFood.setQuantity();
        animalFood.setPricePerKg();
        animalFood.setCaloriesPerKg();
        //animalFood.name = "Juicy meat cubs";
        animalFood.setName("Chunks of meat");
        //animalFood.pricePerKg=1.4;
        //animalFood.quantity=2;
        //animalFood.expirationDate = new Date(2020, 12, 30, 0, 0, 0);
        animalFood.setExpirationDate(2020, 12, 30, 0, 0, 0);
        //animalFood.manufacturingDate = new Date(2019, 12, 15, 0, 0, 0);
        animalFood.setManufacturingDate(2019, 12, 15, 0, 0, 0);
        //animalFood.quantiyAvailable = 200;
        //animalFood.setQuantity(230);
        //animalFood.brand = "Meat&Eat";
        animalFood.setBrand("Purina");
        //animalFood.contentProteinPerKg = 200;
        animalFood.setContentProteinPerKg(210);
        //animalFood.contentFatPerKg = 120;
        animalFood.setContentFatPerKg(132);
        // animalFood.contentSweetPerKg = 20;
        animalFood.setContentSweetPerKg(15.8);
        //animalFood.caloriesPerKg=500;
        System.out.println("Expiration date is " + animalFood.getExpirationDate()/*expirationDate*/);
        System.out.println("Manufacturing date is " + animalFood.getManufacturingDate()/*manufacturingDate*/);
        System.out.println("Data de azi este: " + animalFood.currentDateTime);
       /* if(animalFood.currentDateTime.isAfter(animalFood.getExpirationDate()){
            System.out.println(animalFood.getName()+ " este expirata");
        }*/
      /* if (animalFood.currentDateTime.compareTo(animalFood.getExpirationDate())>0){
           System.out.println(animalFood.getName()+ " este expirata");
       }*/
        LeisureActivities theHappyTime = new LeisureActivities(45, 3, 300, 3);
        theHappyTime.setDurationMinutes();
        theHappyTime.setNumberActivitiesPerDay();
        theHappyTime.setCaloriesBurnt();
        theHappyTime.setSatisfactionLeisure();
        //theHappyTime.name = "A walk in the park";
        theHappyTime.setName("walk in the park");
        //theHappyTime.durationMinutes = 35;
        //theHappyTime.nunmerActivitiesPerDay = 2;
        //theHappyTime.place = "Central Park";
        theHappyTime.setPlace("Track racing");
        //theHappyTime.caloriesBurnt = 59.5;
        //theHappyTime.satisfactionLeisure = 2;
        System.out.println("Today " + dog.getName()/*name*/ + " burnt " + theHappyTime.getCaloriesBurnt()/*caloriesBurnt*/ + " calories");

        Vet theVet = new Vet("Velvet", "Domestic animals", 8000, 14);
        //theVet.name = "Veta";
        //theVet.specialization= "Domestic animals";
        theVet.setName();
        theVet.setSpecialization();
        theVet.setIncomePerAnum();
        theVet.setFeePerHour();
        //theVet.sex = "Female";
        theVet.setSex("Female");
        //theVet.age = 43;
        theVet.setAge(43);
        // theVet.feePerHour=14;
        //theVet.address = "City outskirts";
        theVet.setAddress("City nearby");
        // theVet.incomePerAnum = 8000;
        //theVet.setIncomePerAnum(8890);
        System.out.println("Vet's name is " + theVet.getName()/*name*/);

        Game animalFun = new Game();
        animalFun.adopter = "I am going to buy 2 kg of " + dog.getFoodPreference()/*foodPreference*/ + " for " + dog.getName()/*name*/;
        animalFun.dog = dog.getName()/*name*/ + " has been " + dog.getRecreationPreference()/*recreationPreference*/ + " for " + theHappyTime.getDurationMinutes()/*durationMinutes*/ + " minutes now";
        animalFun.vet = theVet.getName()/*name*/ + " visits " + dog.getName()/*name*/ + " for monthly consultation";
        System.out.println(animalFun.adopter);
        System.out.println(animalFun.dog);
        System.out.println(animalFun.vet);

        Shelter tempShelter = new Shelter("Old dog town", "Oradeaville Nufarul", 1900);
        tempShelter.setName();
        tempShelter.setAddress();
        tempShelter.setSizeSm();
        //tempShelter.name = "Grivei";
        // tempShelter.address = "Oradeaville outskirts";
        // tempShelter.sizeSm = 10000;
        System.out.println(dog.getName()/*name*/ + " was adoptet from animal shelter " + tempShelter.getName()/*name*/ + " located in " + tempShelter.getAddress()/*address*/);

        Drugs animalDrugs = new Drugs(2020, 132, 7, "Grave");
        animalDrugs.setQuantity();
        animalDrugs.setPricePerKg();
        animalDrugs.setCaloriesPerKg();
        animalDrugs.setSideEffects();
        //animalDrugs.name = "Vitamins and food supliments";
        animalDrugs.setName("Vitamins and othes good stuff");
        //animalDrugs.brand = "Vitanimalys";
        animalDrugs.setBrand("Vita bella");
        //animalDrugs.pricePerDose = 20;
        animalDrugs.setPricePerDose(34.6);
        System.out.println(dogOwner.getName()/*name*/ + " buys " + animalDrugs.getBrand()/*brand*/ + " for " + dog.getName()/*name*/);

        Store animalStore = new Store("Pet Store", "Oradeaville south part", 1100, "Peter");
        animalStore.setName();
        animalStore.setAddress();
        animalStore.setSizeSm();
        animalStore.setManager();
        //animalStore.name = "Pet Store";
        //animalStore.adress = " Oradeaville south part";
        //animalStore.manager = "Peter";
        System.out.println(animalDrugs.getBrand()/*brand*/ + " costs " + animalDrugs.getPricePerDose()/*pricePerDose*/ + " $ at " + animalStore.getManager()/*manager*/ + "'s " + animalStore.getName()/*name*/);

        Transport animalTransport;
        animalTransport = new Transport("Taxi2", 1.6);
        animalTransport.setName();
        animalTransport.setPricePerKm();
        // animalTransport.type = "Road";
        animalTransport.setType("Road");
        //animalTransport.name = "Taxi";
        //animalTransport.speedKmPerHour = 45.5;
        animalTransport.setSpeedKmPerHour(34.5);
        //animalTransport.pricePerKm = 1.2;
        System.out.println(theVet.getName()/*name*/ + " uses " + animalTransport.getName()/*name*/ + " to visit " + dog.getName()/*name*/);
        dogOwner.feedAnimal("Chaika", "Meat", 5, 6);
        theHappyTime.playTimeAnimal("Toby", "Spyke", 6, "Chasing cats");

        Bird bird = new Bird(3, 4, 6, 200);
        bird.setName("Tweety");
        bird.setAge(2);
        bird.setFoodPreference("sunflower seeds");
        bird.setRecreationPreference("singing");
        bird.setSpecie("Parrot");
        bird.setColour("redish");
        bird.showAnimalMoodStatus();

        /*
        dog.setName("Tweety");
        dog.setAge(2);
        dog.setFoodPreference("sunflower seeds");
        dog.setRecreationPreference("singing");
        dog.setSpecie("Parrot");
        dog.setColour("redish");
        dog.showAnimalMoodStatus();
         */

        Insect butterfly = new Insect(4, 4, 8, 30, false);
        butterfly.setName("Floppy");
        butterfly.setFoodPreference("Dust");
        butterfly.setSpecie("Blue butterfly");
        butterfly.setColour("blueish");
        butterfly.setRecreationPreference("Flying in circles");
        butterfly.showAnimalMoodStatus();

        /*
        dog.setName("Floppy");
        dog.setFoodPreference("Dust");
        dog.setSpecie("Blue butterfly");
        dog.setColour("blueish");
        dog.setRecreationPreference("Flying in circles");
        bird.showAnimalMoodStatus();
         */
        LogicalOp logicalOp = new LogicalOp();
        //logicalOp.asterix(7);
    }

}
