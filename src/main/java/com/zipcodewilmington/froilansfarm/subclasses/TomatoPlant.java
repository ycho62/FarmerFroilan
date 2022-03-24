package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;
import com.zipcodewilmington.froilansfarm.superclasses.Crop;
import com.zipcodewilmington.froilansfarm.superclasses.Edible;

public class TomatoPlant extends Crop implements Produce {

    @Override
    public <T extends Edible> T yield(Produce producer) {
        return null;
    }
}
