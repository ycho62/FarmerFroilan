package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.subclasses.Farmer;
import com.zipcodewilmington.froilansfarm.superclasses.Person;

public interface Rideable  {


    Boolean getMountStatus();
    public void ride(Person person);
    public void unride(Person farmer);
}
