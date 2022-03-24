package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.collections.CropRow;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        CropRow row1 = new CropRow();


        //When
        //row1.add(cornie);
        row1.add(farmer1.plant(cornie));

        //Then
        Assert.assertTrue(row1.contains(cornie));

    }

    @Test
    void makeNoise() {

    }

    @Test
    void mount() {
    }

    @Test
    void dismount() {
    }
}