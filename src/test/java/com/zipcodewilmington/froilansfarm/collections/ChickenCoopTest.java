package com.zipcodewilmington.froilansfarm.collections;

import com.zipcodewilmington.froilansfarm.subclasses.Chicken;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;


class ChickenCoopTest {

    @Test
    public void addToChickenCoopTest() {
        Chicken chicky = new Chicken();
        ChickenCoop chickenHouse = new ChickenCoop();
        chickenHouse.add(chicky);

        Assert.assertTrue(chickenHouse.contains(chicky));
    }

    @Test
    public void getChickenResidentsTest() {
        ChickenCoop chickenHouse = new ChickenCoop();
        Chicken chicky = new Chicken();
        chickenHouse.add(chicky);
        List<Chicken> chickens = chickenHouse.getResidents();

        Assert.assertTrue(chickenHouse.contains(chicky));
    }
    @Test
    public void chickenSpeaking() {

        Chicken chicky = new Chicken();
        ChickenCoop chickenHouse = new ChickenCoop();
        chickenHouse.add(chicky);
        List<Chicken> chickens = chickenHouse.getResidents();

        Assert.assertTrue(chickenHouse.contains(chicky));
    }

}