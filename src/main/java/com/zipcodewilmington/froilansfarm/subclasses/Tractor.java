package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Harvest;
import com.zipcodewilmington.froilansfarm.superclasses.Crop;
import com.zipcodewilmington.froilansfarm.superclasses.Edible;
import com.zipcodewilmington.froilansfarm.superclasses.Vehicle;

public class Tractor extends Vehicle implements Harvest {
    @Override
    public Boolean harvestCrop(Crop crop) {
        return null;
    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public void ride() {

    }
}

