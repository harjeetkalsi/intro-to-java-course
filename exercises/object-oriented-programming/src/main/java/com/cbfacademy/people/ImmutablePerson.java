package com.cbfacademy.people;

import java.util.Arrays;

public class ImmutablePerson{

    private String firstName;
    private String middleName;
    private String lastName;
    private String[] nickNames;

    public ImmutablePerson(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public void setNickNames(String[] nickNames){
        this.nickNames = nickNames;
    }

    public String getNickNames(){
        return Arrays.toString(this.nickNames);
    }


    public String getFirstName(){
        return this.firstName;
    }

}