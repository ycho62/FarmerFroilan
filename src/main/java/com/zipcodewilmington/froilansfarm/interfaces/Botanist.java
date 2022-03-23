package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.superclasses.Crop;

public interface Botanist {
    //TODO decide how we want to test
    public <T extends Crop> Boolean plant(T typeOfCrop);
}
