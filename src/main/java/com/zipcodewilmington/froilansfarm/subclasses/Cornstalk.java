package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;
import com.zipcodewilmington.froilansfarm.superclasses.Crop;
import com.zipcodewilmington.froilansfarm.superclasses.Edible;

public class Cornstalk extends Crop implements Produce {
    public Cornstalk() {}


    @Override
    public EarCorn yield() {
        if (!isHarvested()){
            return new EarCorn();
        }
        return null;
    }
}
