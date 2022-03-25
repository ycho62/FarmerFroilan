package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.superclasses.Aircraft;
import com.zipcodewilmington.froilansfarm.superclasses.Person;

public class CropDuster extends Aircraft {

    private Boolean mounted = false;
    private Boolean flying = false;

    public CropDuster(){
        super("Dustie");
    }

    public CropDuster(String name) {
        super(name);
    }


    @Override
    public void flyTakeoff() {
        if(ridersList().size()>0 && !flying){
            flying = true;
        }
    }

    @Override
    public void flyLand() {
        if(flying){
            flying = false;
        }
    }

    @Override
    public Boolean flyStatus() {
        return flying;
    }

    @Override
    public String makeNoise() {
        return "Plane go brrrrr";
    }


    @Override
    public void ride(Person person) {
        ridersList().add(person);
        mounted = true;
    }

    @Override
    public void unride(Person farmer) {
        ridersList().remove(farmer);
        if(ridersList().isEmpty()){
            mounted = false;
        }
    }

    @Override
    public Boolean getMountStatus() {return mounted;
    }
}
