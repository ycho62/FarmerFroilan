package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.superclasses.Aircraft;
import com.zipcodewilmington.froilansfarm.superclasses.Person;

public class CropDuster extends Aircraft {

    @Override
    public void fly() {

    }

    @Override
    public String makeNoise() {
        return null;
    }


    @Override
    public void ride(Person person) {
        ridersList().add(person);
    }
}
