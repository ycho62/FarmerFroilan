package com.zipcodewilmington.froilansfarm.collections;

import com.zipcodewilmington.froilansfarm.subclasses.Horse;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StableTest {

    @Test
    public void addToStableTest(){
        //G
        Horse horsey = new Horse("Fred");
        Stable horsePen = new Stable();
        horsePen.add(horsey);

        Assert.assertTrue(horsePen.contains(horsey));
    }

}