package com.zipcodewilmington.froilansfarm.superclasses;

import com.zipcodewilmington.froilansfarm.collections.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {

    private Boolean isHarvested, isFertilized, isYielded;


    @Override
    public Edible yield(Boolean yieldable) {
        return null;
    }

//    public List<T> getCrop () {return }
}
