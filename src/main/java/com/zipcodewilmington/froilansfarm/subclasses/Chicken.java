package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;
import com.zipcodewilmington.froilansfarm.superclasses.Animal;
import com.zipcodewilmington.froilansfarm.superclasses.Edible;

public class Chicken extends Animal implements Produce {
Egg egg = new Egg();


    boolean isFertilized = false;

    public Chicken(){

    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public Egg yield() {
        if (!isFertilized()){
            return egg;
        }
        return null;
    }
    @Override

    public <T extends Edible> void eat(T food) {
        food.setEaten(true);
    }

    public boolean isFertilized() {
        return isFertilized;
    }

    public void setFertilized(boolean fertilized) {
        isFertilized = fertilized;
    }
}
