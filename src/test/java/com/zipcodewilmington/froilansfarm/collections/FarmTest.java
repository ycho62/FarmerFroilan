package com.zipcodewilmington.froilansfarm.collections;

import com.zipcodewilmington.froilansfarm.subclasses.Farmer;
import com.zipcodewilmington.froilansfarm.superclasses.Person;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarmTest {
    @Test
    public void farmOwner() {
        Farm farm1 = new Farm();
        Farmer froilan = new Farmer();
        farm1.setOwner(froilan);


        Assert.assertEquals(farm1.getOwner(),froilan);
    }

}