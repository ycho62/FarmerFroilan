package com.zipcodewilmington.froilansfarm.collections;

import com.zipcodewilmington.froilansfarm.superclasses.Crop;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    public void addCropRow(){
        Field field = new Field();
        CropRow row = new CropRow();
        field.add(row);

        Assert.assertTrue(field.contains(row));
    }
    @Test
    public void addCropRow2(){
        Field field = new Field();
        CropRow row = new CropRow();
        field.add(row);

        Assert.assertTrue(field.contains(row));
    }

}