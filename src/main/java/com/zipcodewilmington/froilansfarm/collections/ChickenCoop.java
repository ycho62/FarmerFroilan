package com.zipcodewilmington.froilansfarm.collections;

import com.zipcodewilmington.froilansfarm.subclasses.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop <T extends Chicken> extends ArrayList<T> implements List<T> {
}
