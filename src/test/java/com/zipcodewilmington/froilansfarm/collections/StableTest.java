package com.zipcodewilmington.froilansfarm.collections;

import com.zipcodewilmington.froilansfarm.subclasses.Cornstalk;
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
    public void getIndexElementTest(){
        Stable horsePen = new Stable();
        Horse horsey = new Horse("Bob");

        horsePen.add(horsey);
        Horse expected = horsePen.get(0);
        Horse actual = horsey;

        Assert.assertEquals(actual,expected);

}
    @Test
    public void getStableOccupancyTest(){
        Stable horsePen = new Stable();
        Horse horsey = new Horse("Bob");
        for (int i = 0; i != 1; i++){
            horsePen.add(new Horse());
        }
        int actual = 1;
        int expected = horsePen.size();

        Assert.assertEquals(actual,expected);
    }
    @Test
    public void getResidentsTest(){

        //Given
        Stable horsePen = new Stable();
        Horse horsey = new Horse("Bob");

        //When
        horsePen.add(horsey);
        List<Horse> horses = horsePen.getResidents();

        //Then
        Assert.assertTrue(horses.contains(horsey));
    }
    @Test
    public void getReturnsCorrectShelterType(){
        Stable horsePen = new Stable();
        Horse horsey = new Horse("Bob");

        horsePen.add(horsey);
        Horse expected = horsePen.get(0);

        Assert.assertTrue(expected instanceof Horse);

    }

}