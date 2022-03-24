package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.superclasses.Animal;
import com.zipcodewilmington.froilansfarm.superclasses.Edible;

public class Horse extends Animal implements Rideable {
    public final String name;
    public Horse(String name) {
   this.name = name;
    }


    @Override
    public String makeNoise() {
        return "Neigh!";
    }

    @Override
    public void ride() {

    }

    @Override
    public <T extends Edible> void eat(T food) {

    }
}
