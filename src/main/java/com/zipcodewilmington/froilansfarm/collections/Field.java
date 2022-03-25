package com.zipcodewilmington.froilansfarm.collections;

import com.zipcodewilmington.froilansfarm.subclasses.Cornstalk;
import com.zipcodewilmington.froilansfarm.superclasses.Crop;
import com.zipcodewilmington.froilansfarm.superclasses.Person;

import java.util.ArrayList;
import java.util.List;


public class Field extends ArrayList<CropRow<Crop>> implements List<CropRow<Crop>> {

    public CropRow getCropRow(int index){
        return this.get(index);
    }

    public Boolean cropContain(Crop crop) {
        Boolean cropFound = false;
        for(CropRow<Crop> a : this){
            if(a.contains(crop)){
                cropFound = true;
            }
        }

        return cropFound;
    }

    public Crop getCrop(int indexCropRow, int indexCrop) {
        CropRow<Crop> croprow = this.getCropRow(indexCropRow);
        return croprow.get(indexCrop);
    }


//<CropRow<Crop>>
}
//        <T extends CropRow> extends ArrayList<T> implements List<T>

