package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.superclasses.Animal;
import com.zipcodewilmington.froilansfarm.superclasses.Edible;
import com.zipcodewilmington.froilansfarm.superclasses.Person;

import java.util.ArrayList;

public class Horse extends Animal implements Rideable {

    ArrayList<Person> riderList = new ArrayList<>();

    private Boolean mounted = false;

    public Horse(){}

    public Horse(String name) {
        super(name);
    }

    @Override
    public void Eat(Edible food) {

    }

    @Override
    public String makeNoise() {
        return "Horse go neeigh:";
    }

    @Override
    public void ride(Person person) {
        riderList.add(person);
        mounted = true;
    }

    @Override
    public void unride(Person person) {
        riderList.remove(person);
        if(riderList.isEmpty()) {
            mounted = false;
        }
    }

    @Override
    public Boolean getMountStatus() {
        return mounted;
    }
}
