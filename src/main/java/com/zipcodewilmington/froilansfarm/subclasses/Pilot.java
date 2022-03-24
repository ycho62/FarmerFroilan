package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.superclasses.Edible;
import com.zipcodewilmington.froilansfarm.superclasses.Person;

public class Pilot extends Person {


    @Override
    public String makeNoise() {
        return null;
    }


    @Override
    public <T extends Edible> void eat(T food) {

    }
}
