package com.zipcodewilmington.froilansfarm.collections;

import com.zipcodewilmington.froilansfarm.superclasses.Person;

import java.util.ArrayList;
import java.util.List;

public class Farmhouse <T extends Person> extends ArrayList<T> implements List<T> {
}
