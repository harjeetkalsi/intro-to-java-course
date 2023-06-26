package com.cbfacademy;

import com.cbfacademy.people.ImmutablePerson;
import com.cbfacademy.Pet;
import com.cbfacademy.Fish;
import com.cbfacademy.Cat;

public class App {
    public static void main(String[] args) {
        
        System.out.println("Hello World!");
              
    //     ImmutablePerson harjeet = new ImmutablePerson("harjeet", "kalsi");

    //    harjeet.setMiddleName("Kaur");
    //    harjeet.setNickNames(new String[]{"a", "b"});
    //    System.out.println(harjeet.getFirstName());
    //    System.out.println(harjeet.getNickNames());

    //    Fish charlie = new Fish("charlie", 2);
    //    System.out.println(charlie.noise());
    //    Cat sam = new Cat("sam", 8);
    //    System.out.println(sam.noise());

        Car car_1 = new Car("bmw", "sports", 2022, 8000);
        System.out.println(car_1.getPrice(1));
        System.out.println(car_1.toString());


      
    }

    
    
    
    
}
