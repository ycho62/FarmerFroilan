package com.zipcodewilmington.froilansfarm.superclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Fly;

public abstract class Aircraft extends Vehicle implements Fly {

    public Aircraft(){

    }

    public Aircraft(String name) {
        super(name);
    }
}
