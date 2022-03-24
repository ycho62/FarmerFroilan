package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.superclasses.Edible;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TomatoPlantTest {

    @Test
    void yieldNotHarvestedTest() {
        TomatoPlant testTomatoPlant = new TomatoPlant();
        testTomatoPlant.setHarvested(false);
        Edible actual = testTomatoPlant.yield();
        Assert.assertTrue(actual instanceof Tomato);
    }

    @Test
    void yieldWhenHarvestedTest() {
        TomatoPlant testTomatoPlant = new TomatoPlant();
        testTomatoPlant.setHarvested(true);
        Edible actual = testTomatoPlant.yield();
        Assert.assertFalse(actual instanceof Tomato);
    }

}