package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.superclasses.Edible;

public interface Produce <T extends Edible> {
    public T yield(Boolean yieldable);
    //TODO implementation of edible.
//     public <T extends Edible> yield (Boolean isFertilized, Boolean isHarvested);



}
