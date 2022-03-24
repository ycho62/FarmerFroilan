package com.zipcodewilmington.froilansfarm.superclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Noisemaker;

import java.util.ArrayList;

public abstract class Person implements Eater, Noisemaker {

    private ArrayList<Edible> eatenMeals = new ArrayList<>();
    private Boolean hungerSatisfied, riding;
    private String name;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void Eat(Edible food){
        eatenMeals.add(food);
        hungerSatisfied = true;
    }

    public int getMealsEaten() {
        return eatenMeals.size();
    }
}
