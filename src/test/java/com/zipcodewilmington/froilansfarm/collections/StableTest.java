package com.zipcodewilmington.froilansfarm.collections;

import com.zipcodewilmington.froilansfarm.subclasses.Horse;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

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

    @Test
    public void getResidentsTest(){
        Stable horsePen = new Stable();
        Horse horsey = new Horse("Bob");
        horsePen.add(horsey);
        List<Horse> horses = horsePen.getResidents();

        Assert.assertTrue(horses.contains(horsey));
    }

}