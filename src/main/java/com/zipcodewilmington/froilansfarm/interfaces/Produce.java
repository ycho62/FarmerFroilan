package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.superclasses.Edible;

public interface Produce {

    public <T extends Edible> T yield();

}
