package com.zipcodewilmington.froilansfarm.collections;

import com.zipcodewilmington.froilansfarm.subclasses.Horse;
import com.zipcodewilmington.froilansfarm.superclasses.Person;

import java.util.ArrayList;
import java.util.List;

public class Stable <T extends Horse> extends ArrayList<T> implements List<T> {
}
