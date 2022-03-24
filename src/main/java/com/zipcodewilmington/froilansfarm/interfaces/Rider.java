package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.subclasses.Horse;
import com.zipcodewilmington.froilansfarm.superclasses.Vehicle;

public interface Rider {


    void mountAnimal(Horse object);
    void mountVehicle(Vehicle vehicle);
    void dismountAnimal(Horse object);
    void dismountVehicle(Vehicle object);
}
