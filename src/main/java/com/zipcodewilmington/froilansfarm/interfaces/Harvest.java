package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.superclasses.Crop;

public interface Harvest <T extends Crop> {
     public <T> Boolean harvestCrop(T crop);
}
