package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.superclasses.Aircraft;
import com.zipcodewilmington.froilansfarm.superclasses.Person;

public class CropDuster extends Aircraft {

    private Boolean mounted = false;

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
        mounted = true;
    }

    @Override
    public void unride(Person farmer) {
        ridersList().remove(farmer);
        if(ridersList().isEmpty()){
            mounted = false;
        }
    }

    @Override
    public Boolean getMountStatus() {
        return false;
    }
}
