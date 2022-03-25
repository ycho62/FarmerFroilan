package com.zipcodewilmington.froilansfarm.collections;

import com.zipcodewilmington.froilansfarm.subclasses.Farmer;
import com.zipcodewilmington.froilansfarm.superclasses.Person;

import java.util.ArrayList;
import java.util.List;

public class Farm<Shelter> extends ArrayList<Shelter> implements List<Shelter> {
    private Person owner;

    public void setOwner(Farmer owner) {
        this.owner = owner;
    }

    public Person getOwner() {return owner;
    }
//    private Person owner;
//
//    public Farm(){
//
//    }
//
//    public Farm(Person owner){
//        this.owner = owner;
//    }
//
//    public getFarm

}
