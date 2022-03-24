package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.superclasses.Animal;
import com.zipcodewilmington.froilansfarm.superclasses.Edible;
import com.zipcodewilmington.froilansfarm.superclasses.Person;

public class Horse extends Animal implements Rideable {
    public final String name;
    Horse neigh;
    public Horse(String name) {
   this.name = name;
    }

    @Override
    public void Eat(Edible food) {

    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public void ride(Person person) {

    }
}
