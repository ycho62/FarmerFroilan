package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.superclasses.Edible;

public interface Eater <T extends Edible> {
    void Eat(T food);
}
