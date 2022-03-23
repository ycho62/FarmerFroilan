package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Harvest;
import com.zipcodewilmington.froilansfarm.superclasses.Crop;
import com.zipcodewilmington.froilansfarm.superclasses.Edible;
import com.zipcodewilmington.froilansfarm.superclasses.Vehicle;

public class Tractor extends Vehicle implements Harvest {


    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public void ride() {

    }

    @Override
    public Boolean harvestCrop(Object crop) {
        return null;
    }
}

