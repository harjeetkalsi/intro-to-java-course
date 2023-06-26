package com.cbfacademy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // String[] example = {"Monday", "Tuesday", "Wednesday"};
        // int j = 0;
        
        // while (j < example.length){
        //     if (j == 1){
        //         j++;
        //         continue;
        //     };
        //     System.out.println("The day is " + example[j]);
        //     j++;
        // }

        FlowControlExercises exercises = new FlowControlExercises(); 
        List<Integer> numbers = Arrays.asList(3, 5, 15, 7);
        System.out.println(exercises.fizzBuzz(numbers));
    }
}
