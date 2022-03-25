package com.zipcodewilmington.froilansfarm.superclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Noisemaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle implements Noisemaker, Rideable {

    List<Person> riderList = new ArrayList<Person>();
    private Boolean mounted = false;

    private String name;

    public Vehicle(){
        this.name = "Vehicle";
    }

    public Vehicle(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return this.name;
    }



    public List<Person> ridersList(){
        return riderList;
    };

    public void ride(Person person){
        riderList.add(person);
        mounted = true;
    };

    public Boolean getMountStatus(){
        return mounted;
    }
}
