package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Harvest;
import com.zipcodewilmington.froilansfarm.superclasses.Person;
import com.zipcodewilmington.froilansfarm.superclasses.Vehicle;

public class Tractor extends Vehicle implements Harvest {

    private boolean mounted = false;

    public Tractor(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Tractor go Beep Beep";
    }

    @Override
    public void ride(Person person) {
        ridersList().add(person);
        mounted = true;
    }

    @Override
    public Boolean harvestCrop(Object crop) {
        return null;
    }
}

