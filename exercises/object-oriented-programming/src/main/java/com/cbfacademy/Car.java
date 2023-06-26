package com.cbfacademy;

public class Car extends Object{

    String make;
    String model; 
    private int year;
    int price;

    public Car (String m, String mdl, int yr, int price){
        this.make = m;
        this.model = mdl;
        this.year = yr;
        this.price = price;
    }


    public String getMake(){
        String detail = "The make of the car is" + this.make;
        return detail;
    }

    public String getModel(){
        String detail = "The make of the car is" + this.model;
        return detail;
    }

    public String getYear(){
        String detail = "The year the car is " + this.year;
        return detail;
    }

    public String getPrice(){
        String detail = "The price of the car is " + this.price;
        return detail;
    }

    public String getPrice(int years_old){
        int new_price = this.price - (years_old * 20);
        String detail = "The price of the car is " + new_price;
        return detail;
    }

    @Override
    public String toString(){
        return "This car is a " + this.model;
    }
}

    

