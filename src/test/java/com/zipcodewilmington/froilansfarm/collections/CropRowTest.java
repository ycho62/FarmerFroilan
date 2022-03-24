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
}