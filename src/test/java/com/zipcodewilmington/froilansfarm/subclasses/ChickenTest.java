package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.superclasses.Edible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {

    @Test
    void eatTest() {
        Chicken testChicken = new Chicken();
        Edible testEdible = new Tomato();

        testChicken.eat(testEdible);

        assertTrue(false);
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