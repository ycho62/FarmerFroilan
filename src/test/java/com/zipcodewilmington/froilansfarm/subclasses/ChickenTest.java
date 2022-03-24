package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.superclasses.Edible;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {

    @Test

    void eatTest() {
        Chicken testChicken = new Chicken();
        Edible testEdible = new Tomato();

        testChicken.eat(testEdible);

        Assert.assertTrue(testEdible.isEaten());
    }



    @Test
    void yieldTest() {
    }

    @Test
    void getHasBeenFertilizedTest() {
    }

    @Test
    void setHasBeenFertilizedTest() {
    }


    @Test
    void makeNoiseTest() {
    }

    @Test
    void yieldNotFertilizedTest() {
    }

    @Test
    void yieldWhenFertilizedTest() {
    }


}