package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.interfaces.*;
import com.zipcodewilmington.froilansfarm.superclasses.*;

import java.util.Locale;

public class Farmer extends Person implements Botanist, Rider {


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
    public void mount() {



    }

    @Override
    public void dismount() {

    }
}

