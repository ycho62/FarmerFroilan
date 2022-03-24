package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.interfaces.*;
import com.zipcodewilmington.froilansfarm.superclasses.*;

import java.util.Locale;

public class Farmer extends Person implements Botanist, Rider {

    private Boolean riding = false;

    public Farmer(){
    }

    public Farmer(String name) {
        super(name);
    }

    @Override
    public Crop plant(String typeOfCrop) {

        if (typeOfCrop.toLowerCase(Locale.ROOT).equals("corn")){
            return new Cornstalk();
        }
        else {
            return  new TomatoPlant();
        }

    }

//    public <T extends Crop> Boolean plant(T typeOfCrop) {
//
//        return null;
//    }


//    @Override
//    public void Eat(Edible food) {
//
//    }

    @Override
    public String makeNoise() {

        return "Waking up real earlivee these days";
    }


    @Override
    public void mountAnimal(Horse horse) {
        riding = true;
        horse.ride(this);
    }

    @Override
    public void mountVehicle(Vehicle vehicle) {
        riding = true;
        vehicle.ride(this);
    }

    @Override
    public void dismountAnimal(Horse horse) {
        horse.unride(this);
        riding = false;
    }

    @Override
    public void dismountVehicle(Vehicle vehicle) {
        vehicle.unride(this);
        riding = false;

    }


}

