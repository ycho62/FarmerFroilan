package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.superclasses.Edible;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CornstalkTest {
    @Test
    void yieldNotHarvestedTest() {
        Cornstalk testCornstalk = new Cornstalk();
        testCornstalk.setHarvested(false);
        Edible actual = testCornstalk.yield();
        Assert.assertTrue(actual instanceof EarCorn);
    }

    @Test
    void yieldWhenHarvestedTest() {
        Cornstalk testCornstalk = new Cornstalk();
        testCornstalk.setHarvested(true);
        Edible actual = testCornstalk.yield();
        Assert.assertFalse(actual instanceof EarCorn);
    }



}