package com.zipcodewilmington.froilansfarm.collections;


import com.zipcodewilmington.froilansfarm.subclasses.Cornstalk;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

class CropRowTest {

    @Test
    public void addToCropRowTest(){
        Cornstalk testCornstalk = new Cornstalk();
        CropRow<Cornstalk> testCornRow = new CropRow<>();
        testCornRow.add(testCornstalk);

        assertTrue(testCornRow.contains(testCornstalk));
    }

    @Test
    public void getCropRowCropTest(){
        Cornstalk testCornstalk = new Cornstalk();
        CropRow<Cornstalk> testCornRow = new CropRow<>();
        testCornRow.add(testCornstalk);
        assertTrue(testCornRow.get(0) instanceof Cornstalk);

    }


    @Test
    public void getIndexElementTest(){
        Cornstalk testCornstalk = new Cornstalk();
        CropRow<Cornstalk> testCornRow = new CropRow<>();
        testCornRow.add(testCornstalk);
        assertTrue(testCornRow.get(0) instanceof Cornstalk);

        testCornRow.add(testCornstalk);
        Cornstalk expected = testCornRow.get(0);
        Cornstalk actual = testCornstalk;

        Assert.assertEquals(actual,expected);
        Assert.assertTrue(expected instanceof Cornstalk);

    }

    @Test
    public void getReturnsCorrectCropType(){
        Cornstalk testCornstalk = new Cornstalk();
        CropRow<Cornstalk> testCornRow = new CropRow<>();
        testCornRow.add(testCornstalk);
        assertTrue(testCornRow.get(0) instanceof Cornstalk);

        testCornRow.add(testCornstalk);
        Cornstalk expected = testCornRow.get(0);

        Assert.assertTrue(expected instanceof Cornstalk);

    }
    @Test
    public void getCropRowSizeTest(){
        CropRow testCornRow = new CropRow();

        for (int i = 0; i != 1; i++){
            testCornRow.add(new Cornstalk());
        }
        int actual = 1;
        int expected = testCornRow.size();

        Assert.assertEquals(actual,expected);
    }
}