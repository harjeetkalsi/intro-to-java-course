package com.cbfacademy;

public class Cat extends Pet{

    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public String noise(){
        return "Meow";
    }
    
}
