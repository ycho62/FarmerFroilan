package com.zipcodewilmington.froilansfarm.subclasses;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TractorTest {

    @Test
    public void createTractorTest(){

        //Given
        String name = "Tonka";
        Tractor truck = new Tractor(name);

        //When
        truck.getName();

        //Then
        Assert.assertEquals(name, truck.getName());

    }

    @Test
    public void rideTractorTest(){

        //Given
        Farmer farmerJoe = new Farmer("Joe");
        Tractor tractorTonka = new Tractor("Tonka");

        //When
        farmerJoe.mountVehicle(tractorTonka);

        //Then
        tractorTonka.ridersList();

        Assert.assertTrue(tractorTonka.ridersList().contains(farmerJoe));

    }

    @Test
    public void mountStatusCheck(){

        //Given
        Farmer farmerJoe = new Farmer("Joe");
        Tractor tractorTonka = new Tractor("Tonka");

        //When
        farmerJoe.mountVehicle(tractorTonka);

        //Then
        Assert.assertTrue(tractorTonka.getMountStatus());
        Assert.assertTrue( tractorTonka.ridersList().contains(farmerJoe));

    }

    @Test
    public void disMountTest(){

        //Given
        Farmer farmerJoe = new Farmer("Joe");
        Tractor tractorTonka = new Tractor("Tonka");

        //When
        farmerJoe.mountVehicle(tractorTonka);
        farmerJoe.dismountVehicle(tractorTonka);

        //Then
        Assert.assertTrue(tractorTonka.ridersList().isEmpty());
    }


}


//Given

//When

//Then