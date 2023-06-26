package com.cbfacademy;

import com.cbfacademy.people.ImmutablePerson;
import com.cbfacademy.Pet;
import com.cbfacademy.Fish;
import com.cbfacademy.Cat;
import com.cbfacademy.shapes.Sphere;
import com.cbfacademy.shapes.Rectangle;

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

        // Car car_1 = new Car("bmw", "sports", 2022, 8000);
        // System.out.println(car_1.getPrice(1));
        // System.out.println(car_1.toString());

        Sphere sphere_1 = new Sphere("sphere_1", 5);
        System.out.println(sphere_1.toString());
        System.out.println(sphere_1.area());

        Rectangle rectangle_1 = new Rectangle("rectangle_1", 1.5, 2);
        System.out.println(rectangle_1.area());

      
    }

    
    
    
    
}
