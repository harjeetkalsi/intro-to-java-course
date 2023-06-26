package com.cbfacademy;

public class Fish extends Pet {
    

    public Fish(String name, int age){
        super(name, age);
    }

    @Override
    public String noise(){
        return "Slient";
    }
}
