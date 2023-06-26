package com.cbfacademy;

public class Dog {

    final static private String SPECIES = "dog";
    final static int legs = 4;

    String breed;
    double weight;
    int age;
    String fur_colour;

    Boolean eating;
    Boolean sleeping;

    public Dog (String breed, double d, int age, String fur_colour){
        this.breed = breed;
        this.weight = d;
        this.age = age;
        this.fur_colour = fur_colour;

    }

    public String getDetails(){
        String details = "This dog breed is: " + this.breed + " of weight: " + this.weight + "kg age: " + this.age + "years and fur colour " +this.fur_colour;
        return details;
    }

    public String eat(){
        this.eating = true;
        return "The dog is now eating";
    }

    public String sleep(){
        this.sleeping = true;
        return "The dog is now sleeping";
    }

}
