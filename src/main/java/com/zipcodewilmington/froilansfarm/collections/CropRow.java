package com.zipcodewilmington.froilansfarm.collections;

import java.util.ArrayList;
import java.util.List;

public class CropRow<T>  {

    List<T> crops = new ArrayList<T>();

    public void add(T crop){
        crops.add(crop);
    }

    public Boolean contains(T crop) {
        return crops.contains(crop);
    }


    public T get(int index) {
        return crops.get(index);
    }

    public int size() {
        return crops.size();
    }
}
