package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.superclasses.Crop;

public interface Harvest <T extends Crop> {
    Boolean harvestCrop(T crop);
}
