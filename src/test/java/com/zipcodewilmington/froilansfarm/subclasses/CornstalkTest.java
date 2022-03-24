package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.superclasses.Edible;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CornstalkTest {
    @Test
    void yieldNotHarvestedTest() {
        Cornstalk testCornstalk = new Cornstalk();
        testCornstalk.setHarvested(false);
        Assert.assertTrue(testCornstalk.yield() instanceof EarCorn);
    }

    @Test
    void yieldWhenHarvestedTest() {
        Cornstalk testCornstalk = new Cornstalk();
        testCornstalk.setHarvested(true);
        Edible actual = testCornstalk.yield();
        Assert.assertFalse(testCornstalk.yield() instanceof EarCorn);
    }



}