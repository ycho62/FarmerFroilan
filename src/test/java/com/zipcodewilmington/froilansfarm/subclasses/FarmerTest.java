package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.collections.ChickenCoop;
import com.zipcodewilmington.froilansfarm.collections.CropRow;
import com.zipcodewilmington.froilansfarm.collections.Farm;
import com.zipcodewilmington.froilansfarm.collections.Field;
import com.zipcodewilmington.froilansfarm.superclasses.Crop;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FarmerTest {

    @Test
    void createFarmerTest(){

        //Given
        String name = "bobbie";

        //
        Farmer farmer1 = new Farmer();
        farmer1.setName(name);
        String actual = farmer1.getName();

        //
        assertEquals(name, actual);

    }

    @Test
    public void eaterTest(){

        //Given
        Egg eggie = new Egg();
        Farmer farmer1 = new Farmer("Bob");
        int expected = 1;
        //When
        farmer1.Eat(eggie);

        //Then

        assertEquals(expected, farmer1.getMealsEaten());

    }

    @Test
    public void eaterTest2(){

        //Given
        Egg eggie = new Egg();
        Tomato ketchup = new Tomato();
        Farmer farmer1 = new Farmer("Bob");
        int expected = 2;
        //When
        farmer1.Eat(eggie);
        farmer1.Eat(ketchup);

        //Then
        assertEquals(expected, farmer1.getMealsEaten());
    }

    @Test
    void plantTest() {

        //Given
        Farmer farmer1 = new Farmer("Joe");
        Cornstalk cornie = new Cornstalk();
        String choice = "corn";
        CropRow row1 = new CropRow();


        //When
        //row1.add(cornie);
        row1.add(farmer1.plant(choice));

        //Then
        int expected = 1;
        Assert.assertEquals(row1.size(),expected);

    }

    @Test
    void makeNoise() {

        Farmer joe = new Farmer("Joe");
        String speak = joe.makeNoise();

        System.out.println(joe.makeNoise());

        Assert.assertEquals(speak, joe.makeNoise());
    }

    @Test
    void mountTest() {

        Farmer roger = new Farmer("Roger");
        Horse horsejack = new Horse("Jack");

        roger.mount();


    }

    @Test
    void dismount() {
    }

    @Test
    void farmerFroilanTest(){

        //Given
        Farmer froilan = new Farmer("Froilan");
        Farm froilansFarm = new Farm();
        froilansFarm.setOwner(froilan);
        Field field = new Field();
        CropRow cropRow = new CropRow();
        ChickenCoop chickenHouse = new ChickenCoop();
        Chicken chicken1 = new Chicken();


        Cornstalk cornRow1 = new Cornstalk();
        TomatoPlant tomatoRow2 = new TomatoPlant();



        //

        froilansFarm.add(field);
        cropRow.add(cornRow1);
        cropRow.add(tomatoRow2);
        field.add(cropRow);


        //
        Assert.assertEquals(cropRow.size(), 2);
        Assert.assertEquals(froilansFarm.getOwner(),froilan);

    }
}