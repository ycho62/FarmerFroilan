package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;
import com.zipcodewilmington.froilansfarm.superclasses.Animal;
import com.zipcodewilmington.froilansfarm.superclasses.Edible;

public class Chicken extends Animal implements Produce {
    /** TODO fix the generic for produce
     * @param yieldable
     * @return*/
    @Override
    public Edible yield(Boolean yieldable) {
        return null;
    }

    @Override
    public void Eat(Edible food) {

    }

    @Override
    public String makeNoise() {
        return null;
    }
}
