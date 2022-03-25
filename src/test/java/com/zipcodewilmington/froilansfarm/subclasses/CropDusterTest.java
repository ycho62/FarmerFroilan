package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.collections.CropRow;
import com.zipcodewilmington.froilansfarm.collections.Field;
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
        int expected = 2;

        //Then
        Assert.assertEquals(expected,dust1.ridersList().size());
    }


    @Test
    public void mountStatusTest(){

        //Give
        Farmer bob = new Farmer("Bob");
        CropDuster dust1 = new CropDuster("");

        //When
        bob.mountVehicle(dust1);

        //Then
        System.out.println(dust1.makeNoise());
        Assert.assertTrue(dust1.getMountStatus());
    }

    @Test
    public void dismountTest(){

        //Give
        Farmer bob = new Farmer("Bob");
        CropDuster dust1 = new CropDuster("");

        //When
        bob.mountVehicle(dust1);
        bob.dismountVehicle(dust1);

        //Then
        System.out.println(dust1.makeNoise());
        Assert.assertFalse(dust1.getMountStatus());
    }

    @Test
    public void flyTakeOffTest(){

        //Give
        Farmer bob = new Farmer("Bob");
        CropDuster dust1 = new CropDuster("");

        //When
        bob.mountVehicle(dust1);
        dust1.flyTakeoff();

        //Then
        Assert.assertTrue(dust1.flyStatus());

    }

    @Test
    public void flyLandTest(){

        //Give
        Farmer bob = new Farmer("Bob");
        CropDuster dust1 = new CropDuster("");

        //When
        bob.mountVehicle(dust1);
        dust1.flyTakeoff();
        dust1.flyLand();

        //Then
        Assert.assertFalse(dust1.flyStatus());
    }

    @Test
    public void fertalizeFieldTest(){

        //Give
        Farmer bob = new Farmer("Bob");
        CropDuster dust1 = new CropDuster("");
        Field cropField = new Field();
        CropRow cornstalkCropRow = new CropRow<>();
        Cornstalk corn1 = new Cornstalk();
        Cornstalk corn2 = new Cornstalk();
        cornstalkCropRow.add(corn1);
        cornstalkCropRow.add(corn2);
        cropField.add(cornstalkCropRow);

        //When
        bob.mountVehicle(dust1);
        dust1.flyTakeoff();
        //dust1.fertalize(cropField);

        //Then


    }
}

//Given

//When

//Then