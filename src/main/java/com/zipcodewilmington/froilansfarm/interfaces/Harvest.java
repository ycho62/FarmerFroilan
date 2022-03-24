package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.superclasses.Crop;

import java.util.List;

public interface Harvest {
     public <T extends Crop> T harvestCrop(List<T> crops);
}
