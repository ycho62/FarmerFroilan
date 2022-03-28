package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.collections.Stable;
import com.zipcodewilmington.froilansfarm.superclasses.Edible;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SundayTest {


    @Test
    void workWeekTest(){
        Farmer froilan = new Farmer("Froilan");
        Farmer froilanda = new Farmer("Froilanda");
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        for(int i = 1; i <=6; i++) {
            Cornstalk testCornstalk = new Cornstalk();
            testCornstalk.setHarvested(true);
            Edible actual = testCornstalk.yield();
        }

        stable1.add(horse1);
        stable2.add(horse2);



        for(int i = 1; i <=3; i++) {
            horse1.eat(actual);
        }

        for(int i = 1; i <=3; i++) {
            horse2.eat(actual);
        }


        horse1.ride(froilan);

        horse2.ride(froilanda);

        Assert.assertFalse(actual instanceof EarCorn);
        Assert.assertEquals(horse1.getMountStatus(), true);
        Assert.assertEquals(horse2.getMountStatus(), true);


        Assert.assertTrue(stable1.contains(horse1));
        Assert.assertTrue(stable1.contains(horse2));






    }
}
