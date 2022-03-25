package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.superclasses.Crop;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CropDusterTest {

    @Test
    public void createCropDuster(){

        //Given
        String name = "dustie";
        CropDuster dust1 = new CropDuster();


        //When
        dust1.setName(name);

        //Then
        Assert.assertEquals(name, dust1.getName());

    }

    @Test
    public void rideCropDuster(){

        //Give
        Farmer bob = new Farmer("Bob");
        CropDuster dust1 = new CropDuster("");

        //When
        bob.mountVehicle(dust1);

        //Then
        Assert.assertTrue(dust1.ridersList().contains(bob));

    }

    @Test
    public void rideCropDusterSize(){

        //Give
        Farmer bob = new Farmer("Bob");
        Farmer bill = new Farmer("Bill");
        CropDuster dust1 = new CropDuster("");

        //When
        bob.mountVehicle(dust1);
        bill.mountVehicle(dust1);

        //Then
        Assert.assertTrue(dust1.ridersList().contains(bob));
    }



}

//Given

//When

//Then