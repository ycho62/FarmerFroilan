package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.superclasses.Animal;
import com.zipcodewilmington.froilansfarm.superclasses.Edible;

public class Horse extends Animal implements Rideable {
    @Override
    public void Eat(Edible food) {

    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public void ride() {

    }
}
