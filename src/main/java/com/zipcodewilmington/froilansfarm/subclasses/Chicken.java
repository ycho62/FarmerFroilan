package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;
import com.zipcodewilmington.froilansfarm.superclasses.Animal;
import com.zipcodewilmington.froilansfarm.superclasses.Edible;

public class Chicken extends Animal implements Produce {

    Boolean hasBeenFertilized = false;

    public Chicken(){

    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public <T extends Edible> T yield(Produce producer) {
        return null;
    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    @Override

    public <T extends Edible> void eat(T food) {
        food.setEaten(true);
    }
}
