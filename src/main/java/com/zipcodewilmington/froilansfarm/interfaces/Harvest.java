package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.collections.CropRow;
import com.zipcodewilmington.froilansfarm.superclasses.Crop;

import java.util.List;

public interface Harvest {
     public void harvestCrop(CropRow<Crop> crops);
}
