package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.superclasses.Edible;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ChickenTest {

    @Test

    void eatTest() {
        Chicken testChicken = new Chicken();
        Edible testEdible = new Tomato();

        testChicken.eat(testEdible);

        Assert.assertTrue(testEdible.isEaten());
    }



    @Test
    void makeNoiseTest() {
        Chicken testChicken = new Chicken();
        String chickenSound = testChicken.makeNoise();
        Assert.assertTrue(chickenSound instanceof String);

    }

    @Test
    void yieldNotFertilizedTest() {
        Chicken testChicken = new Chicken();
        testChicken.setFertilized(false);
        Boolean actual = (testChicken.yield() instanceof Egg);
        Assert.assertTrue(actual);
    }

    @Test
    void yieldWhenFertilizedTest() {
        Chicken testChicken = new Chicken();
        testChicken.setFertilized(true);
        Edible actual = testChicken.yield();
        Assert.assertEquals(actual, null);

    }


}