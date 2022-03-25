package com.zipcodewilmington.froilansfarm.collections;

import com.zipcodewilmington.froilansfarm.subclasses.Cornstalk;
import com.zipcodewilmington.froilansfarm.subclasses.TomatoPlant;
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
        CropRow<Crop> row = new CropRow();
        field.add(row);

        Assert.assertTrue(field.contains(row));
    }

    @Test
    public void getCrop(){
        Field field = new Field();
        CropRow<Crop> row = new CropRow();
        Cornstalk cornie = new Cornstalk();
        row.add(cornie);
        field.add(row);

        //CropRow<Crop> hold = field.getCropRow(0);
        //Cornstalk corn = hold.get(0);

        Assert.assertTrue(field.cropContain(cornie));
    }

    @Test
    public void getCropTomatoPlant(){

        Field field = new Field();
        CropRow<Crop> row = new CropRow();
        Cornstalk cornie = new Cornstalk();
        TomatoPlant tomAtoe = new TomatoPlant();
        row.add(cornie);
        row.add(tomAtoe);
        field.add(row);

            //CropRow<Crop> hold = field.getCropRow(0);
            //Cornstalk corn = hold.get(0);

        Assert.assertTrue(field.cropContain(tomAtoe));

    }

    @Test
    public void getSpecificCrop(){
        Field field = new Field();
        CropRow<Crop> row = new CropRow();
        Cornstalk cornie = new Cornstalk();
        TomatoPlant tomAtoe = new TomatoPlant();
        row.add(cornie);
        row.add(tomAtoe);
        field.add(row);

        Assert.assertEquals(cornie, field.getCrop(0, 0));

    }

}