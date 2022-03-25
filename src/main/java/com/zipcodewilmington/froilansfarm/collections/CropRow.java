package com.zipcodewilmington.froilansfarm.collections;


import java.util.ArrayList;
import java.util.List;


public class CropRow<Crop>  {

    List<Crop> crops = new ArrayList<Crop>();

    public void add(Crop crop){
        crops.add(crop);
    }

    public Boolean contains(Crop crop) {
        return crops.contains(crop);
    }


    public Crop get(int index) {
        return crops.get(index);
    }

    public int size() {
        return crops.size();
    }
}



