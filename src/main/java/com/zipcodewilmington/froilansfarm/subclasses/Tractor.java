package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Harvest;
import com.zipcodewilmington.froilansfarm.superclasses.Crop;
import com.zipcodewilmington.froilansfarm.superclasses.Vehicle;

import java.util.List;

public class Tractor extends Vehicle implements Harvest {


    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public void ride() {

    }


    @Override
    public <T extends Crop> T harvestCrop(List<T> crops) {
        return null;
    }
}

